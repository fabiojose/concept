package com.github.fabiojose.concept.factory;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.exception.FactoryException;
import com.github.fabiojose.concept.visitor.AreaInitializer;

public final class AreaFactory implements IFactory<Area> {

	private static final AreaFactory INSTANCE = new AreaFactory();
	
	private Visitor<Area, Area> initializer;
	private BeingFactory factory;
	private AreaFactory(){
		initializer = new AreaInitializer();
		factory = BeingFactory.getInstance();
	}
	
	public static synchronized AreaFactory getInstance(){
		return INSTANCE;
	}

	@Override
	public Area instanceOf(Class<? extends Area> clazz) throws FactoryException {

		final Area _result = (Area)factory.instanceOf(clazz);
		initialize(_result);
		
		return _result;
	}

	@Override
	public Area initialize(final Area instance) {
		initializer.visit(instance);
		
		return instance;
	}
}
