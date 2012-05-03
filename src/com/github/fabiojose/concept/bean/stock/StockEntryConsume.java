package com.github.fabiojose.concept.bean.stock;

import java.util.Date;

import com.github.fabiojose.concept.bean.Ownership;

public class StockEntryConsume extends Ownership {
	private static final long serialVersionUID = -8194581696691038147L;

	private String ticket;
	
	private StockEntry entry;
	private double consumed;
	private Date date;
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public StockEntry getEntry() {
		return entry;
	}
	public void setEntry(StockEntry entry) {
		this.entry = entry;
	}
	public double getConsumed() {
		return consumed;
	}
	public void setConsumed(double consumed) {
		this.consumed = consumed;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
