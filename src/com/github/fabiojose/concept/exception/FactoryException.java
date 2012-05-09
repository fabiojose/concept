package com.github.fabiojose.concept.exception;

public final class FactoryException extends ConceptException {
	private static final long serialVersionUID = 1345633183266523604L;

	public FactoryException(){
		
	}
	
	public FactoryException(final String message){
		super(message);
	}
	
	public FactoryException(final Throwable cause){
		super(cause);
	}
	
	public FactoryException(final String message, final Throwable cause){
		super(message, cause);
	}
}
