package com.github.fabiojose.concept.bean;

import com.github.fabiojose.concept.Visitor;

public final class BeanExtensionLong extends BeanExtension<Long> {
	private static final long serialVersionUID = -6506599146500004226L;

	private Long value;
	
	@Override
	public int compareTo(BeanExtension<Long> another) {
		return value.compareTo(another.getValue());
	}

	@Override
	public <R> R accept(Visitor<BeanExtension<Long>, R> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Long getValue() {
		return value;
	}

	@Override
	public void setValue(Long value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		BeanExtensionLong other = (BeanExtensionLong) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BeanExtensionLong [value=" + value + ", getName()=" + getName()
				+ "]";
	}
	
	
}
