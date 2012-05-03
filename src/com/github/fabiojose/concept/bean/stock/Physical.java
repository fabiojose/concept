package com.github.fabiojose.concept.bean.stock;

import java.util.Set;

import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.register.IndoorAddress;

public class Physical extends Ownership {
	private static final long serialVersionUID = 5780410676176006449L;

	private String ticket;
	
	private Set<StockEntry> entries;
	private IndoorAddress address;
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public Set<StockEntry> getEntries() {
		return entries;
	}
	public void setEntries(Set<StockEntry> entries) {
		this.entries = entries;
	}
	public IndoorAddress getAddress() {
		return address;
	}
	public void setAddress(IndoorAddress address) {
		this.address = address;
	}
}
