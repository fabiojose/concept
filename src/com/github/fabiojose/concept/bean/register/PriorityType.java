package com.github.fabiojose.concept.bean.register;

import com.github.fabiojose.concept.Constants;
import com.github.fabiojose.concept.bean.AbstractPair;

public final class PriorityType extends AbstractPair<Integer, String> {
	private static final long serialVersionUID = -8592201510448769519L;

	public static final PriorityType HIGH = new PriorityType(Constants.INT_1, Constants.STRING_HIGH);
	public static final PriorityType MEDIUM = new PriorityType(Constants.INT_2, Constants.STRING_MEDIUM);
	public static final PriorityType LOW = new PriorityType(Constants.INT_1, Constants.STRING_LOW);
	
	public PriorityType(){
		
	}
	
	public PriorityType(Integer code, String content){
		super(code, content);
	}
}
