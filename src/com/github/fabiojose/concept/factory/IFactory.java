package com.github.fabiojose.concept.factory;

import com.github.fabiojose.concept.exception.FactoryException;

public interface IFactory<T> {

	T instanceOf(Class<? extends T> clazz) throws FactoryException;
	T initialize(T instance);
	
}
