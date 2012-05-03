package com.github.fabiojose.concept.bean;


public final class PhoneType extends AbstractPair<String, String> {
	private static final long serialVersionUID = -2999572671231145180L;

	public PhoneType(){
		
	}
	
	public PhoneType(final String code, final String content){
		super(code, content);
	}
}
