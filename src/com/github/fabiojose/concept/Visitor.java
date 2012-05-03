package com.github.fabiojose.concept;

public interface Visitor<T, R> {

	R visit(T target);
	
}
