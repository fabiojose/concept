package com.github.fabiojose.concept.bean.place;

import java.util.Set;

public final class State extends Democracy {
	private static final long serialVersionUID = -6163559016061171306L;

	private Country country;
	private Set<City> cities;
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Set<City> getCities() {
		return cities;
	}
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		State other = (State) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "State [getMonogram()=" + getMonogram()
				+ ", getName()=" + getName() + "]";
	}
	
	
}
