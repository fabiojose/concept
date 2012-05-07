package com.github.fabiojose.concept.control;

import com.github.fabiojose.concept.bean.Unit;

public final class PercentCalculator implements Calculator {

	private Unit percent;
	
	@Override
	public Double calculate(final Double percent, final Double value) {
		return (percent / 100D) * value;
	}
	
	public Double getIdentityElement(){
		return 1D;
	}

	@Override
	public Double calculate(Double value) {
		return calculate(percent.getValue(), value);
	}

	@Override
	public Unit getValue() {
		return percent;
	}

	@Override
	public void setValue(Unit value) {
		percent = value;
	}
	
	public Calculator inverse(){
		return this;
	}
}
