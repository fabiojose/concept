package com.github.fabiojose.concept.bean.entity;

import java.util.Date;
import java.util.Set;

import com.github.fabiojose.concept.bean.ICustomer;
import com.github.fabiojose.concept.bean.IOwnership;
import com.github.fabiojose.concept.bean.IPair;
import com.github.fabiojose.concept.bean.Identifiable;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.Phone;
import com.github.fabiojose.concept.bean.place.Address;
import com.github.fabiojose.concept.bean.place.Place;

public class Business extends Place implements Identifiable, ICustomer, IOwnership {
	private static final long serialVersionUID = -5817994313601553134L;

	private String document;
	private String brand;
	private Date foundation;
	private Set<Address> addresses;
	private IPair<Integer, String> classification;
	private Set<Phone> phones;
	
	private Ownership ownership;
	
	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Date getFoundation() {
		return foundation;
	}

	public void setFoundation(Date foundation) {
		this.foundation = foundation;
	}

	@Override
	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public IPair<Integer, String> getClassification() {
		return classification;
	}

	public void setClassification(IPair<Integer, String> classification) {
		this.classification = classification;
	}

	@Override
	public Set<Phone> getPhones() {
		return phones;
	}
	public void setPhones(final Set<Phone> phones){
		this.phones = phones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((document == null) ? 0 : document.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Business other = (Business) obj;
		if (document == null) {
			if (other.document != null)
				return false;
		} else if (!document.equals(other.document))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Business [document=" + document + ", brand=" + brand
				+ ", classification=" + classification + ", getCountry()="
				+ getCountry() + ", getState()=" + getState() + ", getCity()="
				+ getCity() + ", getName()=" + getName() + "]";
	}
	
	public Ownership getOwnership() {
		return ownership;
	}

	public void setOwnership(Ownership ownership) {
		this.ownership = ownership;
	}

	@Override
	public void setOwner(Identifiable owner) {
		getOwnership().setOwner(owner);
	}

	@Override
	public Identifiable getOwner() {
		return getOwnership().getOwner();
	}
	
}
