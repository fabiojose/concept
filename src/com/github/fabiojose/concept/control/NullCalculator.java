package com.github.fabiojose.concept.control;

import com.github.fabiojose.concept.bean.Unit;

public final class NullCalculator implements Calculator {

	@Override
	public Double calculate(Double value1, Double value2) {
		return 0D;
	}
	
	public Double getIdentityElement(){
		return 0D;
	}

	@Override
	public Double calculate(Double value) {
		return value;
	}

	@Override
	public Unit getValue() {
		return null;
	}

	@Override
	public void setValue(Unit value) {
		
	}
	
	public Calculator inverse(){
		return this;
	}
}
