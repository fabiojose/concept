package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.register.IItem;

public final class ItemRawValue implements Visitor<IItem, Double> {

	@Override
	public Double visit(final IItem target) {
		return target.getPrice().getValue() * target.getQuantity().getValue();
	}

}
