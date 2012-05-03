package com.github.fabiojose.concept.bean;

public abstract class BeanExtension<T> implements ConceptBean<BeanExtension<T>> {
	private static final long serialVersionUID = 7118733899495574727L;
	
	private long id;
	private IPair<String, String> name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public IPair<String, String> getName() {
		return name;
	}

	public void setName(IPair<String, String> name) {
		this.name = name;
	}	
	
	public abstract T getValue();
	public abstract void setValue(T value);	
	
}
