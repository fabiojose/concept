package com.github.fabiojose.concept;

public interface Visitable<T> {

	<R> R accept(Visitor<T, R> visitor);
	
}
