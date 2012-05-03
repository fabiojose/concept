package com.github.fabiojose.concept.control;

public final class PercentCalculator implements Calculator {

	@Override
	public double calculate(final double percent, final double value) {
		return (percent / 100D) * value;
	}

}
