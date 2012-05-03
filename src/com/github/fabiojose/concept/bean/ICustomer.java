package com.github.fabiojose.concept.bean;

import java.util.Set;

import com.github.fabiojose.concept.bean.place.Address;

public interface ICustomer {

	long getId();
	void setId(long id);
	
	String getName();
	void setName(String name);
	
	String getDocument();
	void setDocument(String document);
	
	Set<Address> getAddresses();
	void setAddresses(Set<Address> address);
	
	Set<Phone> getPhones();
	void setPhones(Set<Phone> phones);
}
