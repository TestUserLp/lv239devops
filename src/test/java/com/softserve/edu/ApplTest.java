package com.softserve.edu;

import org.testng.annotations.Test;

public class ApplTest {
	@Test
	public void testApp() {
		System.out.println("surefire.reports.directory = " + System.getProperty("surefire.reports.directory"));
		//
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("\nUsed Memory = " + usedMemory / (1024.0 * 1024.0) + "Mb");
		System.out.println("\ntotalMemory() = " + Runtime.getRuntime().totalMemory() / (1024.0 * 1024.0) + "Mb");
		System.out.println("maxMemory() = " + Runtime.getRuntime().maxMemory() / (1024.0 * 1024.0) + "Mb");
		//
		System.out.println("AppTest done");
	}
}
