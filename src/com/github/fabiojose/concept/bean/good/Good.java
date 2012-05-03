package com.github.fabiojose.concept.bean.good;

import com.github.fabiojose.concept.bean.Ownership;

public abstract class Good extends Ownership {
	private static final long serialVersionUID = 5930205337968618133L;

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		Good other = (Good) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Good [code=" + code + ", getOwner()=" + getOwner()
				+ ", getName()=" + getName() + "]";
	}
	
}
