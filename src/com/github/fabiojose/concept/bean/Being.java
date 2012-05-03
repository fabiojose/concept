package com.github.fabiojose.concept.bean;

import java.util.Map;

import com.github.fabiojose.concept.Visitor;

/**
 * The root class
 * @author fabiojose (fabiojose@gmail.com)
 *
 */
public class Being implements ConceptBean<Being> {
	private static final long serialVersionUID = 8469706512804444885L;

	private long id;
	private String name;
	private Map<String, BeanExtension<? extends Object>> extension;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, BeanExtension<? extends Object>> getExtension() {
		return extension;
	}

	public void setExtension(final Map<String, BeanExtension<? extends Object>> extension) {
		this.extension = extension;
	}

	@Override
	public int compareTo(final Being o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public <R> R accept(final Visitor<Being, R> visitor) {
		return visitor.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Being other = (Being) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public BeanExtension<? extends Object> extension(final String key){
		return getExtension().get(key);
	}
}
