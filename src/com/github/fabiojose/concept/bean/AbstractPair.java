package com.github.fabiojose.concept.bean;

import com.github.fabiojose.concept.Visitable;
import com.github.fabiojose.concept.Visitor;

@SuppressWarnings("rawtypes")
public abstract class AbstractPair<C extends Comparable, T extends Comparable> implements IPair<C, T>, Visitable<AbstractPair<C, T>>, Comparable<AbstractPair<C, T>> {
	private static final long serialVersionUID = -4264857648248650460L;

	private C code;
	private T content;
	
	public AbstractPair(){
		
	}
	
	public AbstractPair(C code, T content){
		setCode(code);
		setContent(content);
	}
	
	public AbstractPair(C code){
		setCode(code);
	}
	
	public C getCode() {
		return code;
	}

	public void setCode(C code) {
		this.code = code;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public <R> R accept(Visitor<AbstractPair<C, T>, R> visitor) {
		return visitor.visit(this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int compareTo(AbstractPair<C, T> another) {
		return code.compareTo(another.code) + content.compareTo(another.content);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPair other = (AbstractPair) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AbstractPair [code=" + code + ", content=" + content + "]";
	}
	
}
