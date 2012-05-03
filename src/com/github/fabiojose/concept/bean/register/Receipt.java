package com.github.fabiojose.concept.bean.register;

import java.util.Date;
import java.util.Set;

import com.github.fabiojose.concept.bean.ICustomer;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.entity.Business;

public class Receipt extends Ownership {
	private static final long serialVersionUID = 4448516267306271503L;

	private Business origin;
	private ICustomer customer;
	
	private Long number;
	private Date date;
	private Date emission;
	private IPair<Integer, String> priority;
	private IPair<Integer, String> type;
	private String message;
	
	private Set<ReceiptItem> items;
	
	public Business getOrigin() {
		return origin;
	}
	public void setOrigin(Business origin) {
		this.origin = origin;
	}
	public ICustomer getCustomer() {
		return customer;
	}
	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getEmission() {
		return emission;
	}
	public void setEmission(Date emission) {
		this.emission = emission;
	}
	public IPair<Integer, String> getPriority() {
		return priority;
	}
	public void setPriority(IPair<Integer, String> priority) {
		this.priority = priority;
	}
	public IPair<Integer, String> getType() {
		return type;
	}
	public void setType(IPair<Integer, String> type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Set<ReceiptItem> getItems() {
		return items;
	}
	public void setItems(Set<ReceiptItem> items) {
		this.items = items;
	}	
}
