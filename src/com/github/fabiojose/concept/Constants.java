package com.github.fabiojose.concept;

import java.util.HashSet;
import java.util.Set;

public class Constants {
	public static final int ROOT_LAYER = 0;

	public static final int INT_0 = 0;
	public static final int INT_1 = 1;
	public static final int INT_2 = 2;
	public static final int INT_3 = 3;

	public static final String STRING_INGOING = "INGOING";
	public static final String STRING_OUTGOING = "OUTGOING";
	
	public static final String STRING_EMPTY = "";
	public static final String STRING_HIGH = "HIGH";
	public static final String STRING_MEDIUM = "MEDIUM";
	public static final String STRING_LOW = "LOW";
	public static final String STRING_DOT_SYMBOL = ".symbol";
	public static final String STRING_DOT_NAME = ".name";
	public static final String STRING_DOT_CALCULATOR = ".calculator";
	public static final String STRING_GLOBAL = "GLOBAL";

	public static final class SYSTEM {
		public static final String CONCEPT_XML = "concept.xml";
		public static final Set<String> NEEDED_FILES = new HashSet<String>();
		static{
			NEEDED_FILES.add(CONCEPT_XML);
		};
		public static final String CONCEPT_WORKSPACE  = "concept.workspace";
	}
}
