package com.github.fabiojose.concept.bean.register;

import java.util.Map;

import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.good.Good;

public interface IItem {

	void setGood(Good good);
	Good getGood();
	
	void setPrice(Unit price);
	Unit getPrice();
	
	void setQuantity(Unit quantity);
	Unit getQuantity();
	
	void setPriority(IPair<Integer, String> priority);
	IPair<Integer, String> getPriority();
	
	void setDiscriminators(Map<String, IPair<String, String>> discriminators);
	Map<String, IPair<String, String>> getDiscriminators();
	
	
}
