package com.github.fabiojose.concept.bean.stock;

import java.util.Date;

import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.register.OrderItem;

public class StockEntry extends Ownership {
	private static final long serialVersionUID = -3917268294575650343L;

	private String label;
	
	private OrderItem paper;
	private double quantity;
	private Date date;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public OrderItem getPaper() {
		return paper;
	}
	public void setPaper(OrderItem paper) {
		this.paper = paper;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
