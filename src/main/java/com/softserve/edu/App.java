package com.softserve.edu;

import com.softserve.data.IUser;
import com.softserve.data.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Calendar c;
    	// 1 use constructor
    	//User u = new User("11","22","33","233","21",33);
    	// 2 use setters
//    	User u = new User();
//    	u.setFirstname("111");
//    	u.setLastname("22");
//    	u.setLogin("333");
//    	u.setPassword("444");
//    	u.setEmail("555");
//    	u.setId(11L);
    	// 3 fluent interface
//    	User u = new User()
//    			.setFirstname("111")
//    			//.setLastname("22")
//    			.setLogin("333")
//    			.setPassword("444")
//    			.setEmail("555")
//    			.setId(11L);
    	// 4 static factory
//    	User u = User.get()
//    			.setFirstname("111")
//    			//.setLastname("22")
//    			.setLogin("333")
//    			.setPassword("444")
//    			.setEmail("555")
//    			.setId(11L);
    	// 5 add builder
//    	User u = User.get()
//    			.setFirstname("111")
//    			.setLastname("222")
//    			.setLogin("33")
//    			.setPassword("44")
//    			.setEmail("55")
//    			.setId(123L)
//    			.build();
//    	u.setLastname("sss");
    	// 6 dependency inversion
//    	IUser u = User.get()
//    			.setFirstname("111")
//    			.setLastname("222")
//    			.setLogin("33")
//    			.setPassword("44")
//    			.setEmail("55")
//    			.setId(123L)
//    			.build();
    	// 7 add repository and singleton
    	IUser u = UserRepository.get().admin();
		System.out.println("user name = " + u.getLastname());
    	//System.out.println("user name = " + u.setLastname("sss"));
        System.out.println( "Hello World! - 3" );
    }
}
