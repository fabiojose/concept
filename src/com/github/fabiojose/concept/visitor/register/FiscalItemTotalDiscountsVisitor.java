package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.register.IFiscalItem;
import com.github.fabiojose.concept.bean.register.IItem;

public final class FiscalItemTotalDiscountsVisitor implements Visitor<IFiscalItem, Double> {

	private Visitor<IItem, Double> value = new ItemRawValue();
	
	@Override
	public Double visit(final IFiscalItem target) {

		double _result = 0;
		for(Unit _discount : target.getDiscounts().values()){
			_result += _discount.calculate(value.visit(target));
		}
		
		return _result;
	}

}
