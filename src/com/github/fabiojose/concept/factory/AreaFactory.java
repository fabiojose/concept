package com.github.fabiojose.concept.factory;

import com.github.fabiojose.concept.bean.stock.Area;
import com.github.fabiojose.concept.visitor.initializer.AreaInitializer;

public final class AreaFactory extends CommonFactory<Area> {

	private static final AreaFactory INSTANCE = new AreaFactory();
	
	private AreaFactory(){
		setInitializer(new AreaInitializer());
	}
	
	public static synchronized AreaFactory getInstance(){
		return INSTANCE;
	}
}
