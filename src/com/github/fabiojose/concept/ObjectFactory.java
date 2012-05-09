package com.github.fabiojose.concept;

import java.util.HashMap;
import java.util.Map;

import com.github.fabiojose.concept.bean.Being;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.exception.FactoryException;
import com.github.fabiojose.concept.factory.AreaFactory;
import com.github.fabiojose.concept.factory.IFactory;
import com.github.fabiojose.concept.visitor.BeingInitializer;

public final class ObjectFactory {

	private static final Map<Class, IFactory> FACTORIES = new HashMap<Class, IFactory>();
	private static final ObjectFactory INSTANCE = new ObjectFactory();
	
	static{
		FACTORIES.put(Area.class, AreaFactory.getInstance());
	}
	
	private Visitor<Being, Being> being;
	private ObjectFactory(){
		being = new BeingInitializer();
	}
	
	public static synchronized ObjectFactory getInstance(){
		return INSTANCE;
	}
	
	
	public  <T extends Being> T instanteOf(final Class<T> type) throws FactoryException {
		T _result = null;
		
		final IFactory _factory = FACTORIES.get(type);
		try{
			if(null== _factory){
				_result = type.newInstance();
				_result.accept(being);
			} else {
				_result = (T)_factory.instanceOf(type);
			}
		}catch(IllegalAccessException _e){
			throw new FactoryException(_e.getMessage(), _e);
			
		}catch(InstantiationException _e){
			throw new FactoryException(_e.getMessage(), _e);
		}
		
		return _result;
	}
}
