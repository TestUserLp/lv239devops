package com.softserve.edu;

import org.testng.annotations.Test;

public class ApplTest 
{
	@Test
    public void testApp()
    {
		System.out.println("surefire.reports.directory = " 
				+ System.getProperty("surefire.reports.directory"));
        System.out.println("AppTest done");
    }
}
