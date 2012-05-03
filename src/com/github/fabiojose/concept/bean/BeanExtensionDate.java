package com.github.fabiojose.concept.bean;

import java.util.Date;

import com.github.fabiojose.concept.Visitor;

public final class BeanExtensionDate extends BeanExtension<Date> {
	private static final long serialVersionUID = -2834594299108191574L;
	
	private Date value;
	
	@Override
	public int compareTo(BeanExtension<Date> another) {
		return value.compareTo(another.getValue());
	}

	@Override
	public <R> R accept(Visitor<BeanExtension<Date>, R> visitor) {
		return visitor.visit(this);
	}

	@Override
	public Date getValue() {
		return value;
	}

	@Override
	public void setValue(Date value) {
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
		BeanExtensionDate other = (BeanExtensionDate) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BeanExtensionDate [value=" + value + ", getName()=" + getName()
				+ "]";
	}
	
}
