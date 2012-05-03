package com.github.fabiojose.concept.bean;

public final class Phone extends Being {
	private static final long serialVersionUID = -6220969258962235341L;

	private String number;
	private String note;
	private IPair<String, String> carrier;
	private IPair<String, String> type;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public IPair<String, String> getCarrier() {
		return carrier;
	}
	public void setCarrier(IPair<String, String> carrier) {
		this.carrier = carrier;
	}
	public IPair<String, String> getType() {
		return type;
	}
	public void setType(IPair<String, String> type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Phone other = (Phone) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Phone [number=" + number + ", note=" + note + ", carrier="
				+ carrier + ", type=" + type + "]";
	}
	
}
