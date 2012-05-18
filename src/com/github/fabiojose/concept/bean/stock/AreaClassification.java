package com.github.fabiojose.concept.bean.stock;

import com.github.fabiojose.concept.bean.Pair;

public final class AreaClassification extends Pair<Integer, String> {
	private static final long serialVersionUID = 726089100439739779L;

	public static final AreaClassification BUILD = new AreaClassification(0, "BUILD");
	public static final AreaClassification LOGICAL_AREA = new AreaClassification(1, "LOGICAL_AREA");
	public static final AreaClassification PHYSICAL_AREA = new AreaClassification(2, "PHYSICAL_AREA");
	public static final AreaClassification GANGWAY = new AreaClassification(3, "GANGWAY");
	public static final AreaClassification LEVEL = new AreaClassification(4, "LEVEL");
	public static final AreaClassification CELL = new AreaClassification(5, "CELL");
	
	public AreaClassification(){
		
	}
	
	public AreaClassification(final Integer code, final String content){
		super(code, content);
	}
}
