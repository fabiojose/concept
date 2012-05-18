package com.github.fabiojose.concept;

import java.util.HashMap;
import java.util.Map;

import com.github.fabiojose.concept.bean.Being;
import com.github.fabiojose.concept.bean.entity.Account;
import com.github.fabiojose.concept.bean.entity.Person;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.exception.FactoryException;
import com.github.fabiojose.concept.factory.CommonFactory;
import com.github.fabiojose.concept.factory.IFactory;
import com.github.fabiojose.concept.visitor.initializer.AccountInitializer;
import com.github.fabiojose.concept.visitor.initializer.AreaInitializer;
import com.github.fabiojose.concept.visitor.initializer.CommonInitializer;
import com.github.fabiojose.concept.visitor.initializer.PersonInitializer;

public final class ObjectFactory {

	@SuppressWarnings("rawtypes")
	private static final Map<Class, IFactory> FACTORIES = new HashMap<Class, IFactory>();
	
	@SuppressWarnings("rawtypes")
	private static final Map<Class, Visitor> INITIALIZERS = new HashMap<Class, Visitor>();
	
	private static final ObjectFactory INSTANCE = new ObjectFactory();
	
	static{
		//FACTORIES.put(Area.class, AreaFactory.getInstance());
	}
	
	static{
		INITIALIZERS.put(Area.class, new AreaInitializer());
		INITIALIZERS.put(Account.class, new AccountInitializer());
		INITIALIZERS.put(Person.class, new PersonInitializer());
	}
	
	private Visitor<Being, Being> common;
	private ObjectFactory(){
		common = new CommonInitializer<Being>();
	}
	
	public static synchronized ObjectFactory getInstance(){
		return INSTANCE;
	}
	
	@SuppressWarnings("unchecked")
	private <T extends Being> IFactory<T> getFactory(final Class<T> type){
		
		IFactory<T> _result = FACTORIES.get(type);
		if(null== _result){
			_result = new CommonFactory<T>();
		}
		
		Visitor<T, T> _initializer = INITIALIZERS.get(type);
		if(null== _initializer){
			_initializer = new CommonInitializer<T>();
		}
		
		_result.setInitializer(_initializer);
		return _result;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public  <T extends Being> T instanteOf(final Class<T> type) throws FactoryException {
		T _result = null;
		
		final IFactory _factory = getFactory(type);
		try{
			if(null== _factory){
				_result = type.newInstance();
				_result.accept(common);
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
