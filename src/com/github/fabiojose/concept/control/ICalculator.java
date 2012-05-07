package com.github.fabiojose.concept.control;

public interface ICalculator<V1, V2> {

	V1 calculate(V1 value1, V2 value2);
	V1 getIdentityElement();
}
