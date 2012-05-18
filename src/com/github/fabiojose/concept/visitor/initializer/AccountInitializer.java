package com.github.fabiojose.concept.visitor.initializer;

import java.util.HashSet;

import com.github.fabiojose.concept.bean.entity.Account;
import com.github.fabiojose.concept.bean.entity.Role;

public final class AccountInitializer extends CommonInitializer<Account> {

	@Override
	public Account visit(final Account target) {
		super.visit(target);
		target.setRolePlaying(new HashSet<Role>());
		
		return target;
	}

}
