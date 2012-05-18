package com.github.fabiojose.concept.visitor.initializer;

import java.util.HashSet;

import com.github.fabiojose.concept.bean.Phone;
import com.github.fabiojose.concept.bean.Social;
import com.github.fabiojose.concept.bean.entity.Person;
import com.github.fabiojose.concept.bean.place.Address;

public class PersonInitializer extends CommonInitializer<Person> {

	public Person visit(final Person person){
		super.visit(person);
		person.setAddresses(new HashSet<Address>());
		person.setPhones(new HashSet<Phone>());
		person.setSocials(new HashSet<Social>());
		
		return person;
	}
}
