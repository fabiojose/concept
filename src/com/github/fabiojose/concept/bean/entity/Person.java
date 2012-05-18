package com.github.fabiojose.concept.bean.entity;

import java.util.Date;
import java.util.Set;

import com.github.fabiojose.concept.bean.ICustomer;
import com.github.fabiojose.concept.bean.Identifiable;
import com.github.fabiojose.concept.bean.Ownership;
import com.github.fabiojose.concept.bean.Phone;
import com.github.fabiojose.concept.bean.Social;
import com.github.fabiojose.concept.bean.place.Address;

public class Person extends Ownership implements Identifiable, ICustomer {
	private static final long serialVersionUID = 1L;

	private String document;
	private String alias;
	private Date birthday;
	private Set<Address> addresses;
	private Set<Phone> phones;
	
	private Set<Social> socials;

	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public Set<Address> getAddresses() {
		return addresses;
	}
	@Override
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public Set<Phone> getPhones() {
		return phones;
	}
	@Override
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	
	public Set<Social> getSocials() {
		return socials;
	}
	public void setSocials(Set<Social> socials) {
		this.socials = socials;
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
		Person other = (Person) obj;
		if (document == null) {
			if (other.document != null)
				return false;
		} else if (!document.equals(other.document))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [document=" + document + ", alias=" + alias
				+ ", birthday=" + birthday + ", addresses=" + addresses
				+ ", phones=" + phones + ", getName()=" + getName() + "]";
	}

}
