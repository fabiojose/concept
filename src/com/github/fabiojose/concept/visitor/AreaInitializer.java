package com.github.fabiojose.concept.visitor;

import java.util.HashMap;
import java.util.HashSet;

import com.github.fabiojose.concept.Visitor;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Unit;
import com.github.fabiojose.concept.bean.stock.Area;

public final class AreaInitializer implements Visitor<Area, Area> {

	@Override
	public Area visit(final Area target) {
		target.setChildren(new HashSet<Area>());
		target.setClassifications(new HashSet<IPair<Integer,String>>());
		target.setMetrics(new HashMap<String, Unit>());
		
		return target;
	}

}
