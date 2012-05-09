package com.github.fabiojose.concept.visitor.stock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.github.fabiojose.concept.ObjectFactory;
import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Pair;
import com.github.fabiojose.concept.bean.register.Physical;
import com.github.fabiojose.concept.bean.stock.StockPhysical;

public final class PhysicalFragmentor implements Visitor<Physical, Set<StockPhysical>> {

	private double factor;
	private ObjectFactory factory = ObjectFactory.getInstance();
	
	@Override
	public Set<StockPhysical> visit(final Physical target) {

		final Set<StockPhysical> _result = new HashSet<StockPhysical>();
		double _total = target.getQuantity().getValue();
		int _counter = 1;
		do{
			double _quantity;
			if(Double.compare(_total, factor) > 0){
				_quantity = factor;
				_total -= factor;
				
			} else {
				_quantity = _total;
				_total = 0D;
			}
			
			final StockPhysical _stock = factory.instanteOf(StockPhysical.class);
			_stock.setPhysical(target);
			_stock.setQuantity(_quantity);
			_stock.setDiscriminators(new HashMap<String, IPair<String,String>>());
			_stock.getDiscriminators().put("FRAGMENT", new Pair<String, String>("COUNT", String.valueOf(_counter)));
			
			_result.add(_stock);
			_counter++;
		}while(_total > 0D);
		
		for(StockPhysical _stock : _result){
			final IPair<String, String> _fragment = _stock.getDiscriminators().get("FRAGMENT"); 
			_fragment.setContent(_fragment.getContent() + " / " + String.valueOf(_counter - 1));
		}
		return _result;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}
}
