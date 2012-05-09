package com.github.fabiojose.concept.factory;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Being;
import com.github.fabiojose.concept.exception.FactoryException;
import com.github.fabiojose.concept.visitor.BeingInitializer;

public class BeingFactory implements IFactory<Being> {
	private static final BeingFactory INSTANCE = new BeingFactory();
	
	private Visitor<Being, Being> initializer;
	private BeingFactory(){
		initializer = new BeingInitializer();
	}
	
	public static synchronized BeingFactory getInstance(){
		return INSTANCE;
	}
	
	@Override
	public Being instanceOf(Class<? extends Being> clazz) throws FactoryException {
		Being _result = null;
		
		try{
			_result = clazz.newInstance();
			initialize(_result);
			
		}catch(IllegalAccessException _e){
			throw new FactoryException(_e.getMessage(), _e);
			
		}catch(InstantiationException _e){
			throw new FactoryException(_e.getMessage(), _e);
		}
		
		return _result;
	}

	@Override
	public Being initialize(final Being instance) {
		initializer.visit(instance);
		
		return instance;
	}

}
