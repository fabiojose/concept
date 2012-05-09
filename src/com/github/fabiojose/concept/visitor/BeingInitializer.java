package com.github.fabiojose.concept.visitor;

import java.util.HashMap;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.BeanExtension;
import com.github.fabiojose.concept.bean.Being;

public class BeingInitializer implements Visitor<Being, Being> {

	@Override
	public Being visit(final Being target) {
		target.setExtension(new HashMap<String, BeanExtension<? extends Object>>());
		
		return target;
	}

}
