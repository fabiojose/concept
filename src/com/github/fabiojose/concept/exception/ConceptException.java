package com.github.fabiojose.concept.exception;

public class ConceptException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ConceptException(){
		
	}
	
	public ConceptException(final String message){
		super(message);
	}
	
	public ConceptException(final Throwable cause){
		super(cause);
	}
	
	public ConceptException(final String message, final Throwable cause){
		super(message, cause);
	}
}
