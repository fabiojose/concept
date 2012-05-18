package com.github.fabiojose.concept.factory;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Being;
import com.github.fabiojose.concept.exception.FactoryException;
import com.github.fabiojose.concept.visitor.initializer.CommonInitializer;

public class CommonFactory<T extends Being> implements IFactory<T> {

	private Visitor<T, T> initializer;	
	public CommonFactory(){
		initializer = new CommonInitializer<T>();
	}
	
	public CommonFactory(final Visitor<T, T> initializer){
		this();
		this.initializer = initializer;
	}
	
	public void setInitializer(final Visitor<T, T> initializer){
		this.initializer = initializer;
	}
	
	@Override
	public T instanceOf(Class<? extends T> clazz) throws FactoryException {
		return instanceOf(clazz, initializer);
	}
	
	public T instanceOf(Class<? extends T> clazz, Visitor<T, T> initializer) throws FactoryException {
		
		T _result = null;
		try{
			_result = clazz.newInstance();
			initialize(_result, initializer);
			
		}catch(IllegalAccessException _e){
			throw new FactoryException(_e.getMessage(), _e);
			
		}catch(InstantiationException _e){
			throw new FactoryException(_e.getMessage(), _e);
		}	
		
		return _result;
	}

	@Override
	public T initialize(final T instance) {
		initialize(instance, initializer);		
		return instance;
	}
	
	public T initialize(final T instance, final Visitor<T, T> initializer) {
		initializer.visit(instance);
		return instance;
	}
}
