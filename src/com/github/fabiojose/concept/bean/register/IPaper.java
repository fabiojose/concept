package com.github.fabiojose.concept.bean.register;

import java.util.Date;
import java.util.Set;

import com.github.fabiojose.concept.bean.IPair;

public interface IPaper {

	void setNumber(Long number);
	Long getNumber();
	
	void setDate(Date date);
	Date getDate();
	
	void setPriority(IPair<Integer, String> priority);
	IPair<Integer, String> getPriority();
	
	void setType(IPair<Integer, String> type);
	IPair<Integer, String> getType();
	
	void setMessage(String message);
	String getMessage();
	
	Set<IItem> items();
}
