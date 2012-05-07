package com.github.fabiojose.concept.control;

import com.github.fabiojose.concept.bean.Unit;

public final class UnitValueReturnCalculator implements Calculator {

	private Unit value;
	
	@Override
	public Double calculate(Double unitValue, Double value2) {
		return unitValue;
	}

	public Double getIdentityElement(){
		return 0D;
	}

	@Override
	public Double calculate(Double value) {
		return getValue().getValue();
	}

	@Override
	public Unit getValue() {
		return value;
	}

	@Override
	public void setValue(Unit value) {
		this.value = value;
	}
	
	public Calculator inverse(){
		return this;
	}
}
