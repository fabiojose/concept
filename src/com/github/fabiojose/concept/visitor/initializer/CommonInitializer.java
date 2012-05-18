package com.github.fabiojose.concept.visitor.initializer;

import java.util.HashMap;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.Being;

public class CommonInitializer<T extends Being> implements Visitor<T, T> {

	@Override
	public T visit(final T target) {
		target.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		
		return target;
	}

}
