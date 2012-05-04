package com.github.fabiojose.concept.bean.stock;

import java.util.Set;

import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.register.Physical;

public class StockEntry extends Ownership {
	private static final long serialVersionUID = -3917268294575650343L;

	private Set<Physical> physicals;
	private IndoorAddress address;
	
	
}
