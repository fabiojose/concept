package com.github.fabiojose.concept.bean.factory;

import java.util.HashSet;

import com.github.fabiojose.concept.Context;
import com.github.fabiojose.concept.bean.place.City;
import com.github.fabiojose.concept.bean.place.Country;
import com.github.fabiojose.concept.bean.place.State;
import com.github.fabiojose.concept.i18n.LocaleManager;

public final class StateFactory {

	private static final StateFactory INSTANCE = new StateFactory();
	private LocaleManager manager;
	
	private StateFactory(){
		manager = LocaleManager.getInstance();
	}
	
	public static synchronized StateFactory getInstance(){
		return INSTANCE;
	}
	
	public State newInstance(final Country country, final String monogram){
		
		final State _result = new State();
		_result.setCities(new HashSet<City>());
		_result.setCountry(country);
		
		country.getStates().add(_result);
		_result.setMonogram(monogram);
		_result.setName(manager.localized(monogram, new Context(LocaleManager.STATE, country.getMonogram())));
		
		return _result;
	}
}
