package com.github.fabiojose.concept.bean.good;

import java.util.Map;

import com.github.fabiojose.concept.bean.Unit;

public final class ServiceGood extends Good {
	private static final long serialVersionUID = 5020563191155249749L;

	private Map<String, Unit> estimations;

	public Map<String, Unit> getEstimations() {
		return estimations;
	}

	public void setEstimations(Map<String, Unit> estimations) {
		this.estimations = estimations;
	}

	@Override
	public String toString() {
		return "ServiceGood [estimations=" + estimations + ", toString()="
				+ super.toString() + "]";
	}

}
