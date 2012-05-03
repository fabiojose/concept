package com.github.fabiojose.concept.bean.place;

import com.github.fabiojose.concept.bean.AbstractPair;

public final class Address extends Place {
	private static final long serialVersionUID = -219494644114052699L;

	private AbstractPair<Integer, String> type;

	public AbstractPair<Integer, String> getType() {
		return type;
	}

	public void setType(AbstractPair<Integer, String> type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [type=" + type + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
