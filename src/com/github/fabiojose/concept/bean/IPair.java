package com.github.fabiojose.concept.bean;

import java.io.Serializable;

@SuppressWarnings("rawtypes")
public interface IPair<C extends Comparable, T extends Comparable> extends Serializable, Cloneable {

	public C getCode();
	public void setCode(C code);
	
	public T getContent();
	public void setContent(T content);
	
}
