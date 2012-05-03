package com.github.fabiojose.concept.bean;

@SuppressWarnings("rawtypes")
public class Pair<C extends Comparable, T extends Comparable> extends AbstractPair<C, T> {
	private static final long serialVersionUID = -4264857648248650460L;

	public Pair(){
		
	}
	
	public Pair(C code, T content){
		super(code, content);
	}
	
	public Pair(C code){
		super(code);
	}
}
