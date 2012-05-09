package com.github.fabiojose.concept.bean.stock;

import java.util.Map;
import java.util.Set;

import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.Unit;

public class Area extends Ownership {
	private static final long serialVersionUID = 1L;

	private String code;
	private Map<String, Unit> metrics;
	
	private Area parent;
	private Set<Area> children;
	
	private Set<IPair<Integer, String>> classifications;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Map<String, Unit> getMetrics() {
		return metrics;
	}
	public void setMetrics(Map<String, Unit> metrics) {
		this.metrics = metrics;
	}
	public Area getParent() {
		return parent;
	}
	public void setParent(Area parent) {
		this.parent = parent;
	}
	public Set<Area> getChildren() {
		return children;
	}
	public void setChildren(Set<Area> children) {
		this.children = children;
	}
	public Set<IPair<Integer, String>> getClassifications() {
		return classifications;
	}
	public void setClassifications(Set<IPair<Integer, String>> classifications) {
		this.classifications = classifications;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((classifications == null) ? 0 : classifications.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		Area other = (Area) obj;
		if (classifications == null) {
			if (other.classifications != null)
				return false;
		} else if (!classifications.equals(other.classifications))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Area [code=" + code + ", metrics=" + metrics
				+ ", classifications=" + classifications + ", getName()="
				+ getName() + "]";
	}
	
}
