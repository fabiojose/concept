package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.register.IFiscalItem;
import com.github.fabiojose.concept.bean.register.IItem;

public final class FiscalItemTotalTaxesVisitor implements Visitor<IFiscalItem, Unit> {

	private Visitor<IItem, Unit> value = new ItemRawValue();
	
	@Override
	public Unit visit(final IFiscalItem target) {

		final Unit _result = new Unit();
		_result.setSymbol(target.getPrice().getSymbol());
		
		double _value = 0D;
		for(Unit _taxe : target.getTaxes().values()){
			_value += _taxe.calculate(value.visit(target).getValue()).getValue();
		}
		
		_result.setValue(_value);
		
		return _result;
	}

}
