package com.github.fabiojose.concept.i18n;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import com.github.fabiojose.concept.Context;

public final class LocaleManager {
	
	public static final Context CURRENCY = new Context("CURRENCY");
	public static final Context MASS = new Context("MASS");
	public static final Context COUNTRY = new Context("COUNTRY");
	public static final Context STATE = new Context("STATE");
	public static final Context CITY = new Context("CITY");
	public static final Context TIME = new Context("TIME");
	public static final Context COMMON = new Context("COMMON");
	public static final Context LENGTH = new Context("LENGTH");
	
	private static final Map<String, String> BASE_NAME = new HashMap<String, String>();
	static{
		BASE_NAME.put(CURRENCY.getName(), "com/github/fabiojose/concept/i18n/Currency");
		BASE_NAME.put(MASS.getName(), "com/github/fabiojose/concept/i18n/Mass");
		BASE_NAME.put(COUNTRY.getName(), "com/github/fabiojose/concept/i18n/Country");
		BASE_NAME.put(STATE.getName(), "com/github/fabiojose/concept/i18n/State");
		BASE_NAME.put(CITY.getName(), "com/github/fabiojose/concept/i18n/City");
		BASE_NAME.put(TIME.getName(), "com/github/fabiojose/concept/i18n/Time");
		BASE_NAME.put(COMMON.getName(), "com/github/fabiojose/concept/i18n/Common");
		BASE_NAME.put(LENGTH.getName(), "com/github/fabiojose/concept/i18n/Length");
	}
	
	private static final LocaleManager INSTANCE = new LocaleManager();
	private static final Map<Context, ResourceBundle> POOL = new HashMap<Context, ResourceBundle>();
	
	private LocaleManager(){
		
	}
	
	public static synchronized LocaleManager getInstance(){
		return INSTANCE;
	}
	
	private ResourceBundle context(final Context context){
		
		ResourceBundle _result = POOL.get(context);
		if(null== _result){
			_result = ResourceBundle.getBundle(context.doQualified(BASE_NAME.get(context.getName())));
			POOL.put(context, _result);
		}
		
		return _result;
	}
	
	public String localized(final String key, final Context context){
		return context(context).getString(key);
	}
}
