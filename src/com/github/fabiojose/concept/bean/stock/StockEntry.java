package com.github.fabiojose.concept.bean.stock;

import java.util.Date;
import java.util.Set;

import com.github.fabiojose.concept.bean.Ownership;

public class StockEntry extends Ownership {
	private static final long serialVersionUID = -3917268294575650343L;
	
	private Date date;
	
	private Area location;
	private Set<StockPhysical> physicals;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Area getLocation() {
		return location;
	}
	public void setLocation(Area location) {
		this.location = location;
	}
	public Set<StockPhysical> getPhysicals() {
		return physicals;
	}
	public void setPhysicals(Set<StockPhysical> physicals) {
		this.physicals = physicals;
	}
	@Override
	public String toString() {
		return "StockEntry [date=" + date + ", location=" + location
				+ ", physicals=" + physicals + "]";
	}
}
