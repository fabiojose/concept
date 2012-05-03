package com.github.fabiojose.concept.bean.register;

import java.util.Map;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Being;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.good.Good;

public class ReceiptItem extends Being implements IFiscalItem {
	private static final long serialVersionUID = -7967015937374390828L;

	private Receipt receipt;
	
	private Good good;
	private Unit quantity;
	private Unit price;
	private IPair<Integer, String> priority;
	private Map<String, IPair<String, String>> discriminators;
	
	private Map<String, Unit> taxes;
	private Map<String, Unit> discounts;
	private Map<String, Unit> adjustments;
	
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	public Good getGood() {
		return good;
	}
	public void setGood(Good good) {
		this.good = good;
	}
	public Unit getQuantity() {
		return quantity;
	}
	public void setQuantity(Unit quantity) {
		this.quantity = quantity;
	}
	public Unit getPrice() {
		return price;
	}
	public void setPrice(Unit price) {
		this.price = price;
	}
	public IPair<Integer, String> getPriority() {
		return priority;
	}
	public void setPriority(IPair<Integer, String> priority) {
		this.priority = priority;
	}
	public Map<String, IPair<String, String>> getDiscriminators() {
		return discriminators;
	}
	public void setDiscriminators(Map<String, IPair<String, String>> discriminators) {
		this.discriminators = discriminators;
	}
	public Map<String, Unit> getTaxes() {
		return taxes;
	}
	public void setTaxes(Map<String, Unit> taxes) {
		this.taxes = taxes;
	}
	public Map<String, Unit> getDiscounts() {
		return discounts;
	}
	public void setDiscounts(Map<String, Unit> discounts) {
		this.discounts = discounts;
	}
	public Map<String, Unit> getAdjustments() {
		return adjustments;
	}
	public void setAdjustments(Map<String, Unit> adjustments) {
		this.adjustments = adjustments;
	}
	
	public <R> R accept(final Visitor<Being, R> visitor) {
		return visitor.visit(this);
	}
	
	public <R> R accept2(final Visitor<? super ReceiptItem, R> visitor){
		return visitor.visit(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((discriminators == null) ? 0 : discriminators.hashCode());
		result = prime * result + ((good == null) ? 0 : good.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		ReceiptItem other = (ReceiptItem) obj;
		if (discriminators == null) {
			if (other.discriminators != null)
				return false;
		} else if (!discriminators.equals(other.discriminators))
			return false;
		if (good == null) {
			if (other.good != null)
				return false;
		} else if (!good.equals(other.good))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ReceiptItem [good=" + good + ", quantity=" + quantity
				+ ", price=" + price + ", priority=" + priority
				+ ", discriminators=" + discriminators + ", taxes=" + taxes
				+ ", discounts=" + discounts + ", adjustments=" + adjustments
				+ "]";
	}
}
