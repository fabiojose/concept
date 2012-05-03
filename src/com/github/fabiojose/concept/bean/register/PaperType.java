package com.github.fabiojose.concept.bean.register;

import com.github.fabiojose.concept.Constants;
import com.github.fabiojose.concept.bean.AbstractPair;

public class PaperType extends AbstractPair<Integer, String> {
	private static final long serialVersionUID = 5650143588374216763L;

	public static final AbstractPair<Integer, String> INGOING = new PaperType(Constants.INT_0, Constants.STRING_INGOING);
	public static final AbstractPair<Integer, String> OUTGOING = new PaperType(Constants.INT_1, Constants.STRING_OUTGOING);
	
	public PaperType(){
		
	}
	
	public PaperType(Integer code, String content){
		super(code, content);
	}
	
}
