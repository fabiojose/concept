package com.github.fabiojose.concept.control;

import com.github.fabiojose.concept.bean.Unit;

public interface Calculator extends ICalculator<Double, Double> {

	Double calculate(Double value1, Double value2);
	
	Double calculate(Double value);
	
	Unit getValue();
	void setValue(Unit value);
	
	Calculator inverse();
}
