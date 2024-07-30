package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends baseClass{
	/*@Before(order = 1)
	public void run1() {
		System.out.println("before 1");

	}
	@Before(order = 21)
	public void run2() {
		System.out.println("before 21");

	}
	@Before(order = 3)
	public void run3() {
		System.out.println("before 3");

	}*/
	@Before(order = 4)
	public void launch() {
		launchBrowser();
	}
	
	@After(order = 1)
	public void quit() {
		quitBrowser();		
}
	/*@After(order = 2)
	public void afterrun2() {
		System.out.println("after 2");

	}
	@After(order = 3)
	public void afterrun3() {
		System.out.println("after 3");

	}*/
}

