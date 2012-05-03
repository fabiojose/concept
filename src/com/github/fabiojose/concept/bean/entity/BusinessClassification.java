package com.github.fabiojose.concept.bean.entity;

import com.github.fabiojose.concept.bean.AbstractPair;

public final class BusinessClassification extends AbstractPair<Integer, String> {
	private static final long serialVersionUID = -1247808931238061758L;

	public BusinessClassification(){
		
	}
	
	public BusinessClassification(final Integer code, final String content){
		setCode(code);
		setContent(content);
	}
}
