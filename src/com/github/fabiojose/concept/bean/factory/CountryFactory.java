package com.github.fabiojose.concept.bean.factory;

import java.util.HashMap;
import java.util.HashSet;

import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.place.Country;
import com.github.fabiojose.concept.bean.place.State;
import com.github.fabiojose.concept.i18n.LocaleManager;

public final class CountryFactory {

	private static final CountryFactory INSTANCE = new CountryFactory();
	private LocaleManager manager;
	
	private CountryFactory(){
		manager = LocaleManager.getInstance();
	}
	
	public static synchronized CountryFactory getInstance(){
		return INSTANCE;
	}
	
	public Country newInstance(final String isocode){
		

		final Country _result = new Country();
		_result.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		_result.setStates(new HashSet<State>());
		_result.setMonogram(isocode);
		_result.setName(manager.localized(isocode, LocaleManager.COUNTRY));
		
		return _result;
	}
}
