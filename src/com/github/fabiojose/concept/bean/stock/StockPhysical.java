package com.github.fabiojose.concept.bean.stock;

import java.util.Date;
import java.util.Map;

import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.register.Physical;

public final class StockPhysical extends Ownership {
	private static final long serialVersionUID = -1780644873669214574L;

	private Date date;
	
	private Physical physical;
	private double quantity;
	
	private Map<String, IPair<Integer, String>> rules;
	private Map<String, IPair<String, String>> discriminators;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Physical getPhysical() {
		return physical;
	}

	public void setPhysical(Physical physical) {
		this.physical = physical;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Map<String, IPair<Integer, String>> getRules() {
		return rules;
	}

	public void setRules(Map<String, IPair<Integer, String>> rules) {
		this.rules = rules;
	}
	
	public Map<String, IPair<String, String>> getDiscriminators() {
		return discriminators;
	}

	public void setDiscriminators(Map<String, IPair<String, String>> discriminators) {
		this.discriminators = discriminators;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((discriminators == null) ? 0 : discriminators.hashCode());
		result = prime * result
				+ ((physical == null) ? 0 : physical.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rules == null) ? 0 : rules.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockPhysical other = (StockPhysical) obj;
		if (discriminators == null) {
			if (other.discriminators != null)
				return false;
		} else if (!discriminators.equals(other.discriminators))
			return false;
		if (physical == null) {
			if (other.physical != null)
				return false;
		} else if (!physical.equals(other.physical))
			return false;
		if (Double.doubleToLongBits(quantity) != Double
				.doubleToLongBits(other.quantity))
			return false;
		if (rules == null) {
			if (other.rules != null)
				return false;
		} else if (!rules.equals(other.rules))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StockPhysical [date=" + date + ", physical=" + physical
				+ ", quantity=" + quantity + ", rules=" + rules
				+ ", discriminators=" + discriminators + "]";
	}

}
