package com.github.fabiojose.concept.exception;

public final class InvalidEnvironmentException extends ConceptException {
	private static final long serialVersionUID = -1354438084699123242L;

	public InvalidEnvironmentException(){
		
	}
	
	public InvalidEnvironmentException(final String message){
		super(message);
	}
	
	public InvalidEnvironmentException(final Throwable cause){
		super(cause);
	}

	public InvalidEnvironmentException(final String message, final Throwable cause){
		super(message, cause);
	}
}
