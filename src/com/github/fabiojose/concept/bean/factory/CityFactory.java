package com.github.fabiojose.concept.bean.factory;

import com.github.fabiojose.concept.Context;
import com.github.fabiojose.concept.bean.place.City;
import com.github.fabiojose.concept.bean.place.State;
import com.github.fabiojose.concept.i18n.LocaleManager;

public final class CityFactory {

	private static final CityFactory INSTANCE = new CityFactory();
	private LocaleManager manager;
	
	private CityFactory(){
		manager = LocaleManager.getInstance();
	}
	
	public static synchronized CityFactory getInstance(){
		return INSTANCE;
	}
	
	public City newInstance(final State state, final String code){
		
		final City _result = new City();
		state.getCities().add(_result);
		
		_result.setState(state);
		_result.setMonogram(code);
		_result.setName(manager.localized(code, new Context(LocaleManager.CITY, state.getCountry().getMonogram())));
		
		return _result;
	}

}
