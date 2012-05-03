package com.github.fabiojose.concept;

import com.github.fabiojose.concept.bean.ConceptBean;

public final class Context implements ConceptBean<Context> {
	private static final long serialVersionUID = -413661838821141520L;

	private String name;
	private String discriminator;
	
	public Context(final String name){
		this.name = name;
		this.discriminator = Constants.STRING_EMPTY;
	}
	public Context(final String name, final String discriminator){
		this(name);
		this.discriminator = discriminator;
	}
	public Context(final Context context, final String discriminator){
		this(context.getName());
		this.discriminator = discriminator;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDiscriminator() {
		return discriminator;
	}
	
	public String getQualified(){
		
		return doQualified(name);
	}
	
	public String doQualified(final String baseName){
		return baseName + (!discriminator.trim().equals(Constants.STRING_EMPTY) ? discriminator : Constants.STRING_EMPTY);
	}

	@Override
	public int compareTo(final Context another) {
		return name.compareTo(another.getName());
	}

	@Override
	public <R> R accept(final Visitor<Context, R> visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((discriminator == null) ? 0 : discriminator.hashCode());
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
		Context other = (Context) obj;
		if (discriminator == null) {
			if (other.discriminator != null)
				return false;
		} else if (!discriminator.equals(other.discriminator))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
