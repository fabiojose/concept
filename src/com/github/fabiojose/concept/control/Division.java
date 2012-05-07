package com.github.fabiojose.concept.control;

public final class Division implements Calculator {

	private com.github.fabiojose.concept.bean.Unit value;
	public Division(){
		
	}
	
	public Division(final com.github.fabiojose.concept.bean.Unit value){
		this.value = value;
	}
	
	@Override
	public Double getIdentityElement() {
		return 1D;
	}

	@Override
	public Double calculate(Double value1, Double value2) {
		return value1 / value2;
	}

	public Double calculate(Double value){
		return calculate(value, this.value.getValue());
	}
	
	public com.github.fabiojose.concept.bean.Unit getValue(){
		return value;
	}
	
	public void setValue(final com.github.fabiojose.concept.bean.Unit value){
		this.value = value;
	}

	@Override
	public Calculator inverse() {
	
		return new Multiplication(getValue());
	}
}
