package com.github.fabiojose.concept.bean.place;

import com.github.fabiojose.concept.bean.Being;

public class Democracy extends Being {
	private static final long serialVersionUID = -8280955491862224568L;

	private String monogram;

	public String getMonogram() {
		return monogram;
	}

	public void setMonogram(String monogram) {
		this.monogram = monogram;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((monogram == null) ? 0 : monogram.hashCode());
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
		Democracy other = (Democracy) obj;
		if (monogram == null) {
			if (other.monogram != null)
				return false;
		} else if (!monogram.equals(other.monogram))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Democracy [monogram=" + monogram + ", getName()=" + getName()
				+ "]";
	}
}
