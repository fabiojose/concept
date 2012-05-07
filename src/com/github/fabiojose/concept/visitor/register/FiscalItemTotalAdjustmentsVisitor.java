package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.register.IFiscalItem;
import com.github.fabiojose.concept.bean.register.IItem;

public final class FiscalItemTotalAdjustmentsVisitor implements Visitor<IFiscalItem, Unit> {

private Visitor<IItem, Unit> value = new ItemRawValue();
	
	@Override
	public Unit visit(final IFiscalItem target) {

		final Unit _result = new Unit();
		_result.setSymbol(target.getPrice().getSymbol());
		
		double _value = 0;
		for(Unit _discount : target.getAdjustments().values()){
			_value += _discount.calculate(value.visit(target).getValue()).getValue();
		}
		
		_result.setValue(_value);
		
		return _result;
	}

}
