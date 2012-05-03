package com.github.fabiojose.concept;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;

public final class Commons {

	private static final Commons INSTANCE = new Commons();
	
	private Commons(){
	}

	public static synchronized Commons getInstance(){
		return INSTANCE;
	}
	
	public Date newDate(final int year, final int month, final int date){
		final Calendar _calendar = Calendar.getInstance();
		_calendar.set(year, month, date);
		
		return _calendar.getTime();
	}
	
	public <T> void copy(final T from, final T to) throws RuntimeException{
		
		try{
			BeanUtils.copyProperties(to, from);
			
		}catch(InvocationTargetException _e){
			throw new RuntimeException(_e.getMessage(), _e);
			
		}catch(IllegalAccessException _e){
			throw new RuntimeException(_e.getMessage(), _e);
		}
	}
}
