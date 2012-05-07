package com.github.fabiojose.concept.control;

import com.github.fabiojose.concept.bean.Unit;

public final class Multiplication implements Calculator {

	private Unit value;
	
	public Multiplication(){
		
	}
	
	public Multiplication(final Unit value){
		this.value = value;
	}
	
	@Override
	public Double getIdentityElement() {
		return 1D;
	}

	@Override
	public Double calculate(Double value1, Double value2) {
		return value1 * value2;
	}

	public Double calculate(Double value){
		return calculate(value, this.value.getValue());
	}
	
	public Unit getValue(){
		return value;
	}
	
	public void setValue(Unit value){
		this.value = value;
	}
	
	public Calculator inverse(){
		return new Division(getValue());
	}
}
