package com.softserve.data;

interface IFirstname {
	ILastname setFirstname(String firstname);
}

interface ILastname {
	ILogin setLastname(String lastname);
}

interface ILogin {
	IPassword setLogin(String login);
}

interface IPassword {
	IEmail setPassword(String password);
}

interface IEmail {
	IId setEmail(String email);
}

interface IId {
	IBuild setId(long id);
}

interface IBuild {
	User build();
}

// POJO
public class User implements IFirstname, ILastname, ILogin, IPassword, IEmail, IId, IBuild, IUser {
	private String firstname;
	private String lastname;
	private String login;
	private String password;
	private String email;
	private long id;

	// public User(String firstname, String lastname, String login, String
	// password, String email, long id) {
	// this.firstname = firstname;
	// this.lastname = lastname;
	// this.login = login;
	// this.password = password;
	// this.email = email;
	// this.id = id;
	// }

	private User() {
	}

	public static IFirstname get() {
		return new User();
	}

	// set

	public ILastname setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public ILogin setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public IPassword setLogin(String login) {
		this.login = login;
		return this;
	}

	public IEmail setPassword(String password) {
		this.password = password;
		return this;
	}

	public IId setEmail(String email) {
		this.email = email;
		return this;
	}

	public IBuild setId(long id) {
		this.id = id;
		return this;
	}

	public User build() {
		return this;
	}

	// get

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public long getId() {
		return id;
	}

}
