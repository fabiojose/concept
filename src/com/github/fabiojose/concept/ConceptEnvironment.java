package com.github.fabiojose.concept;

import java.io.File;

import com.github.fabiojose.concept.Constants.SYSTEM;
import com.github.fabiojose.concept.exception.InvalidEnvironmentException;

public final class ConceptEnvironment {

	private ConceptEnvironment(){
		
	}
	
	private static void validateFiles(final File directory) throws InvalidEnvironmentException {
		
		for(String _name : SYSTEM.NEEDED_FILES){
			final File _file = new File(directory, _name);
			if(_file.exists()){
				if(!_file.isFile()){
					throw new InvalidEnvironmentException("Path are not a file: " + _file.getAbsolutePath());
				}
			} else {
				throw new InvalidEnvironmentException("File not found: " + _file.getAbsolutePath());
			}
		}
	}
	
	public static void validade() throws InvalidEnvironmentException {
		
		final String _workspace = System.getProperty(SYSTEM.CONCEPT_WORKSPACE);
		if(null!= _workspace && !_workspace.trim().equals(Constants.STRING_EMPTY)){
			
			final File _dir = new File(_workspace);
			if(!_dir.exists()){
				throw new InvalidEnvironmentException("Directory not exist: " + _dir.getAbsolutePath());
			} else {
				if(!_dir.isDirectory()){
					throw new InvalidEnvironmentException("Path are not a directory: " + _dir.getAbsolutePath());
				}
			}
			
			//workspace it is ok
			validateFiles(_dir);
		} else {
			throw new InvalidEnvironmentException("System property not found: " + SYSTEM.CONCEPT_WORKSPACE);
		}
	}
	
	public static void configure() throws InvalidEnvironmentException {
		
	}
	
	public static void main(String...args){
		validade();
	}
}
