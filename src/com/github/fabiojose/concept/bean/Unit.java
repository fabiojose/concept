package com.github.fabiojose.concept.bean;

import java.util.ArrayList;
import java.util.List;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.factory.UnitFactory;
import com.github.fabiojose.concept.control.Calculator;

public class Unit implements ConceptBean<Unit> {
	private static final long serialVersionUID = -6389992446478210494L;
	
	private IPair<String, String> symbol;
	private double value;
	
	private transient List<Calculator> calculators;
	
	public Unit(){
		setSymbol(new Pair<String, String>());
		calculators = new ArrayList<Calculator>();
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

	@Override
	public int compareTo(Unit o) {
		return getSymbol().getCode().compareTo(o.getSymbol().getCode());
	}

	@Override
	public <R> R accept(Visitor<Unit, R> visitor) {
		return visitor.visit(this);
	}
	
	public Unit calculator(final Calculator calculator){
		calculators.add(calculator);
		
		return this;
	}
	
	public Unit calculate(final double input){
		
		Unit _base = this;
		double _value = input;
		for(Calculator _calculator : calculators){
			_value = _calculator.calculate(_value);
			
			_base = _calculator.getValue();
		}
		
		final Unit _result = UnitFactory.getInstance().clone(_base);
		_result.setValue(_value);
		
		return _result;
	}
	
	public Unit calculate(){
		return calculate(getValue());
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
}
