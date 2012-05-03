package com.github.fabiojose.concept.bean.good;

import java.util.Map;

import com.github.fabiojose.concept.bean.Unit;

public class ArtifactGood extends Good {
	private static final long serialVersionUID = 4928152391621452039L;

	private Map<String, Unit> metrics;

	public Map<String, Unit> getMetrics() {
		return metrics;
	}

	public void setMetrics(Map<String, Unit> metrics) {
		this.metrics = metrics;
	}

	@Override
	public String toString() {
		return "ArtifactGood [metrics=" + metrics + ", toString()="
				+ super.toString() + "]";
	}
	
}
