package com.github.fabiojose.concept.bean.entity;

import java.util.Arrays;
import java.util.Set;

public final class Account extends Person {
	private static final long serialVersionUID = -2092974999223232340L;

	private String user;
	private char[] password;
	private Set<Role> rolePlaying;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public Set<Role> getRolePlaying() {
		return rolePlaying;
	}

	public void setRolePlaying(Set<Role> rolePlaying) {
		this.rolePlaying = rolePlaying;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(password);
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Account other = (Account) obj;
		if (!Arrays.equals(password, other.password))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [user=" + user + ", password="
				+ Arrays.toString(password) + ", rolePlaying=" + rolePlaying
				+ ", getName()=" + getName() + "]";
	}
	
}
