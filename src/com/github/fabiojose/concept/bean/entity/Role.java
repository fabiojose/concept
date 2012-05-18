package com.github.fabiojose.concept.bean.entity;

import com.github.fabiojose.concept.bean.Being;

public class Role extends Being {
	private static final long serialVersionUID = 9206488342444757822L;

	private int layer;
	private String description;
	
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + layer;
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
		Role other = (Role) obj;
		if (layer != other.layer)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Role [layer=" + layer + ", description=" + description
				+ ", getName()=" + getName() + "]";
	}
}
