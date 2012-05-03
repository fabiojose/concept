package com.github.fabiojose.concept.bean;

public class Ownership extends Being {
	private static final long serialVersionUID = 9111396272474491671L;

	private Identifiable owner;

	public Identifiable getOwner() {
		return owner;
	}

	public void setOwner(Identifiable owner) {
		this.owner = owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		Ownership other = (Ownership) obj;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ownership [owner=" + owner + ", getId()=" + getId()
				+ ", getName()=" + getName() + "]";
	}
	
}
