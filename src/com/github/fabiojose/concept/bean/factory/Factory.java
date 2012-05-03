package com.github.fabiojose.concept.bean.factory;

public interface Factory<T> {

	T newInstance();
	T newInstance(Object...args);
	
}
