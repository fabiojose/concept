package com.github.fabiojose.concept.bean;

import com.github.fabiojose.concept.Visitor;

public final class BeanExtensionString extends BeanExtension<String> {
	private static final long serialVersionUID = -3014065802587825207L;
	
	private String value;
	
	@Override
	public int compareTo(BeanExtension<String> another) {
		return value.compareTo(another.getValue());
	}

	@Override
	public <R> R accept(Visitor<BeanExtension<String>, R> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) {
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
		BeanExtensionString other = (BeanExtensionString) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BeanExtensionString [value=" + value + ", getName()="
				+ getName() + "]";
	}

	
}
