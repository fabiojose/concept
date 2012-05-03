package com.github.fabiojose.concept.visitor.register;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.register.IFiscalItem;
import com.github.fabiojose.concept.bean.register.IItem;

public final class FiscalItemNetValueVisitor implements Visitor<IFiscalItem, Unit> {

	private Visitor<IFiscalItem, Unit> taxes = new FiscalItemTotalTaxesVisitor();
	private Visitor<IFiscalItem, Unit> discounts = new FiscalItemTotalDiscountsVisitor();
	private Visitor<IFiscalItem, Unit> adjustments = new FiscalItemTotalAdjustmentsVisitor();
	private Visitor<IItem, Unit> value = new ItemRawValue();
	
	@Override
	public Unit visit(final IFiscalItem target) {

		final Unit _result = new Unit();
		_result.setSymbol(target.getPrice().getSymbol());
		
		final double _taxes = taxes.visit(target).getValue();
		final double _discounts = discounts.visit(target).getValue();
		final double _adjustments = adjustments.visit(target).getValue();
		final double _value = value.visit(target).getValue();
		
		_result.setValue(_value - _taxes - _discounts - _adjustments);
		return _result;
	}

}
