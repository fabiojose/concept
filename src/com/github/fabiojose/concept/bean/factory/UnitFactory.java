package com.github.fabiojose.concept.bean.factory;

import java.util.MissingResourceException;

import com.github.fabiojose.concept.Constants;
import com.github.fabiojose.concept.Context;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Pair;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.control.Calculator;
import com.github.fabiojose.concept.exception.ConceptException;
import com.github.fabiojose.concept.i18n.LocaleManager;

public final class UnitFactory {

	private static final UnitFactory INSTANCE = new UnitFactory();
	private LocaleManager lmanager;
	
	private UnitFactory(){
		lmanager = LocaleManager.getInstance();
	}
	
	public static synchronized UnitFactory getInstance(){
		return INSTANCE;
	}
	
	private Unit newInstance(final String code, final double value, final Context context){
		
		final Unit _result = new Unit();
		final IPair<String, String> _symbol = new Pair<String, String>();
		
		String _scode = code;
		try{
			_scode = lmanager.localized(code + Constants.STRING_DOT_SYMBOL, context);
		}catch(MissingResourceException _e){
		}
		_symbol.setCode(_scode);
		_symbol.setContent(lmanager.localized(code + Constants.STRING_DOT_NAME, context));
		_result.setSymbol(_symbol);
		
		_result.setValue(value);
		
		try{
			String _scalculator = null;
			try{
				//try #1 - local calculator
				_scalculator = lmanager.localized(code + Constants.STRING_DOT_CALCULATOR, context);
				
			}catch(MissingResourceException _e){
				//try #2 - global calculator
				_scalculator = lmanager.localized(Constants.STRING_GLOBAL + Constants.STRING_DOT_CALCULATOR, context);
			}
			
			final Class<?> _calculator = Class.forName(_scalculator);
			_result.setCalculator((Calculator)_calculator.newInstance());
			
		}catch(MissingResourceException _e){
		}catch(ClassNotFoundException _e){
			throw new ConceptException(_e.getMessage(), _e);
		}catch(IllegalAccessException _e){
			throw new ConceptException(_e.getMessage(), _e);
		}catch(InstantiationException _e){
			throw new ConceptException(_e.getMessage(), _e);
		}
		
		return _result;
	}
	
	public Unit currency(final String isocode, final double value){
		
		return newInstance(isocode, value, LocaleManager.CURRENCY);
	}
	
	public Unit mass(final String sicode, final double value){
		
		return newInstance(sicode, value, LocaleManager.MASS);
	}
	
	public Unit time(final String sicode, final double value){
		
		return newInstance(sicode, value, LocaleManager.TIME);
	}
	
	public Unit common(final String code, final double value){
		
		return newInstance(code, value, LocaleManager.COMMON);
	}
	
	public Unit length(final String sicode, final double value){
		
		return newInstance(sicode, value, LocaleManager.LENGTH);
	}
}
