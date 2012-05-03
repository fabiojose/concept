package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.register.IFiscalItem;
import com.github.fabiojose.concept.bean.register.IItem;

public final class FiscalItemTotalTaxesVisitor implements Visitor<IFiscalItem, Double> {

	private Visitor<IItem, Double> value = new ItemRawValue();
	
	@Override
	public Double visit(final IFiscalItem target) {

		double _result = 0D;
		for(Unit _taxe : target.getTaxes().values()){
			_result += _taxe.calculate(value.visit(target));
		}
		
		return _result;
	}

}
