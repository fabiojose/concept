package com.github.fabiojose.concept.bean.register;

import java.util.Date;
import java.util.Map;

import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.Unit;

public class Physical extends Ownership implements IExpiratory {
	private static final long serialVersionUID = -8249020325125286731L;
	
	private OrderItem paper;
	private Unit quantity;
	
	private Map<String, IPair<String, String>> discriminators;
	
	private Date date;
	private Date expire;

	public OrderItem getPaper() {
		return paper;
	}

	public void setPaper(OrderItem paper) {
		this.paper = paper;
	}

	public Unit getQuantity() {
		return quantity;
	}

	public void setQuantity(Unit quantity) {
		this.quantity = quantity;
	}

	public Map<String, IPair<String, String>> getDiscriminators() {
		return discriminators;
	}

	public void setDiscriminators(Map<String, IPair<String, String>> discriminators) {
		this.discriminators = discriminators;
	}

	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	@Override
	public Date getExpire() {
		return expire;
	}

	@Override
	public void setExpire(Date expire) {
		this.expire = expire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((discriminators == null) ? 0 : discriminators.hashCode());
		result = prime * result + ((expire == null) ? 0 : expire.hashCode());
		result = prime * result + ((paper == null) ? 0 : paper.hashCode());
		result = prime * result
				+ ((quantity == null) ? 0 : quantity.hashCode());
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
		Physical other = (Physical) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (discriminators == null) {
			if (other.discriminators != null)
				return false;
		} else if (!discriminators.equals(other.discriminators))
			return false;
		if (expire == null) {
			if (other.expire != null)
				return false;
		} else if (!expire.equals(other.expire))
			return false;
		if (paper == null) {
			if (other.paper != null)
				return false;
		} else if (!paper.equals(other.paper))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Physical [paper=" + paper + ", quantity=" + quantity
				+ ", discriminators=" + discriminators + ", date=" + date
				+ ", expire=" + expire + ", getName()=" + getName() + "]";
	}
	
}
