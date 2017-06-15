package com.softserve.data;

public final class UserRepository {
	private static volatile UserRepository instance;

	private UserRepository() {
	}

	public static UserRepository get() {
		if (instance == null) {
			synchronized (UserRepository.class) {
				if (instance == null) {
					instance = new UserRepository();
				}
			}
		}
		return instance;
	}
	
	public IUser admin() {
		return User.get()
    			.setFirstname("111")
    			.setLastname("222")
    			.setLogin("33")
    			.setPassword("44")
    			.setEmail("55")
    			.setId(123L)
    			.build();
	}

//	public IUser customer() {
//		//Read from file
//	}

}
