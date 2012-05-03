package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.register.IItem;

public final class ItemRawValue implements Visitor<IItem, Unit> {

	@Override
	public Unit visit(final IItem target) {
		
		final Unit _result = new Unit();
		final double _value = target.getPrice().getValue() * target.getQuantity().getValue();
		
		_result.setSymbol(target.getPrice().getSymbol());
		_result.setValue(_value);
		
		return _result;
	}

}
