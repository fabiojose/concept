package com.github.fabiojose.concept.bean.place;

import com.github.fabiojose.concept.bean.AbstractPair;

public class AddressType extends AbstractPair<Integer, String> {
	private static final long serialVersionUID = 1311336380974598634L;

	public AddressType(){
		
	}
	
	public AddressType(final Integer code, final String content){
		setCode(code);
		setContent(content);
	}
}
