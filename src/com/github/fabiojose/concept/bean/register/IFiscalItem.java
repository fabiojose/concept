package com.github.fabiojose.concept.bean.register;

import java.util.Map;

import com.github.fabiojose.concept.bean.Unit;

public interface IFiscalItem extends IItem {

	void setTaxes(Map<String, Unit> taxes);
	Map<String, Unit> getTaxes();
	
	void setDiscounts(Map<String, Unit> discounts);
	Map<String, Unit> getDiscounts();
	
	void setAdjustments(Map<String, Unit> adjustments);
	Map<String, Unit> getAdjustments();
}
