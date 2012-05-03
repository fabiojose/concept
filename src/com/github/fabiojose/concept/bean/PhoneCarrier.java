package com.github.fabiojose.concept.bean;


public final class PhoneCarrier extends Ownership implements IPair<String, String> {
	private static final long serialVersionUID = -36705444404790738L;

	private IPair<String, String> pair;
	public PhoneCarrier(){
		pair = new Pair<String, String>();
	}
	
	public PhoneCarrier(final String code, final String content){
		this();
		pair.setCode(code);
		pair.setContent(content);
	}

	@Override
	public String getCode() {
		return pair.getCode();
	}

	@Override
	public void setCode(String code) {
		pair.setCode(code);
	}

	@Override
	public String getContent() {
		return pair.getContent();
	}

	@Override
	public void setContent(String content) {
		pair.setContent(content);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pair == null) ? 0 : pair.hashCode());
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
		PhoneCarrier other = (PhoneCarrier) obj;
		if (pair == null) {
			if (other.pair != null)
				return false;
		} else if (!pair.equals(other.pair))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PhoneCarrier [pair=" + pair + ", getOwner()=" + getOwner()
				+ ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	
}
