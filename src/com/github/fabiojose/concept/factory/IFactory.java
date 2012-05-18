package com.github.fabiojose.concept.factory;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.exception.FactoryException;

public interface IFactory<T> {

	void setInitializer(Visitor<T, T> initializer);
	
	T instanceOf(Class<? extends T> clazz) throws FactoryException;
	T instanceOf(Class<? extends T> clazz, Visitor<T, T> initializer) throws FactoryException;
	
	T initialize(T instance);
	T initialize(T instance, Visitor<T, T> initializer);
	
}
