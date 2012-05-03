package com.github.fabiojose.concept.bean;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.control.Calculator;
import com.github.fabiojose.concept.control.NullCalculator;

public final class Unit implements ConceptBean<Unit> {
	private static final long serialVersionUID = -6389992446478210494L;

	private IPair<String, String> symbol;
	
	private double value;
	
	private transient Calculator calculator;
	
	public Unit(){
		setCalculator(new NullCalculator());
	}
	
	public Unit(final IPair<String, String> symbol, final double value){
		this();
		setSymbol(symbol);
		setValue(value);
	}
	
	public Unit(final IPair<String, String> symbol, final double value, final Calculator calculator){
		this(symbol, value);
	}
	
	public IPair<String, String> getSymbol() {
		return symbol;
	}

	public void setSymbol(IPair<String, String> symbol) {
		this.symbol = symbol;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public int compareTo(final Unit another) {
		return symbol.getCode().compareTo(another.getSymbol().getCode());
	}

	@Override
	public <R> R accept(final Visitor<Unit, R> visitor) {
		return visitor.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Unit [symbol=" + symbol + ", value=" + value + "]";
	}

	public double calculate(final double input){
		return getCalculator().calculate(value, input);
	}
}
