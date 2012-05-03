package com.github.fabiojose.concept.bean.place;

import java.util.Set;

import com.github.fabiojose.concept.bean.Identifiable;

public final class Country extends Democracy implements Identifiable {
	private static final long serialVersionUID = 7490065494422504835L;

	private Set<State> states;

	public Set<State> getStates() {
		return states;
	}

	public void setStates(Set<State> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Country [getMonogram()=" + getMonogram()
				+ ", getName()=" + getName() + "]";
	}
	
}
