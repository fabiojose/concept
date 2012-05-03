package com.github.fabiojose.concept.bean.register;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Ownership;

public class Order extends Ownership implements IPaper {
	private static final long serialVersionUID = -6792979144698450075L;

	private Long number;
	private Date date;
	private IPair<Integer, String> priority;
	private IPair<Integer, String> type;
	private String message;
	
	private Set<OrderItem> items;

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

	public Set<OrderItem> getItems() {
		return items;
	}

	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Order other = (Order) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [number=" + number + ", date=" + date + ", priority="
				+ priority + ", type=" + type + ", message=" + message + "]";
	}

	@Override
	public Set<IItem> items() {
		
		final Set<IItem> _result = new HashSet<IItem>();
		for(OrderItem _item : getItems()){
			_result.add(_item);
		}
		
		return Collections.unmodifiableSet(_result);
	}
	
}
