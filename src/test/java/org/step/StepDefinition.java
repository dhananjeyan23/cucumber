package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends baseClass{

	//instance variable --> driver declaration 
	
	@Given("user have to launch the facebook aplication through chrome browser")
	public void user_have_to_launch_the_facebook_aplication_through_chrome_browser() {
	   //driver = new ChromeDriver();
	   //driver.get("https://www.facebook.com");
	}
	
	@Given("user have to launch the amazon aplication through chrome browser")
	public void user_have_to_launch_the_amazon_aplication_through_chrome_browser() {
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in");
	}
	
	@Given("user have to maximize the window")
	 public void user_have_to_maximize_the_window() {
	    driver.manage().window().maximize();
	}
	
	@When("user have to enter the product to search")
	public void user_have_to_enter_the_product_to_search() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
	}

	@When("user have to click search")
	public void user_have_to_click_search() {
		 driver.findElement(By.id("nav-search-submit-button")).click();
	}


	@When("user have to enter the valid username and invalid password")
	public void user_have_to_enter_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dt) {
List<String> l1 = dt.asList();
driver.findElement(By.id("email")).sendKeys(l1.get(0));
driver.findElement(By.name("pass")).sendKeys(l1.get(1));
	}
	
	@When("user have to enter the invalid username and invalid password")
	public void user_have_to_enter_the_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable dt2) {
		List<List<String>> al2 = dt2.asLists(); //3 list of data --> 3 rows
		List<String> l2 = al2.get(2);//2 nd index data will run
		driver.findElement(By.id("email")).sendKeys(l2.get(0));;
		driver.findElement(By.name("pass")).sendKeys(l2.get(1));
	}

	@When("user have to enter the username and invalid password")
	public void user_have_to_enter_the_username_and_invalid_password(io.cucumber.datatable.DataTable dt3) {
		Map<String, String> m = dt3.asMap(String.class, String.class);
		driver.findElement(By.id("email")).sendKeys(m.get("username"));;
		driver.findElement(By.name("pass")).sendKeys(m.get("password"));
	}
	@When("user have to enter the username and  password")
	public void user_have_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dt4) {
		List<Map<String, String>> asmap = dt4.asMaps(String.class, String.class);
	Map<String, String> map = asmap.get(2);
	driver.findElement(By.id("email")).sendKeys(map.get("username"));;
	driver.findElement(By.name("pass")).sendKeys(map.get("password"));
	}
	
	
	@When("user have to enter the empty username and invalid password")
	public void user_have_to_enter_the_empty_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("");
	    driver.findElement(By.name("pass")).sendKeys("123456");
	}
	

@When("user have to enter the {string} and  {string}")
public void user_have_to_enter_the_and(String username, String password) {
	driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.name("pass")).sendKeys(password);
}

	@When("user have to click the login button")
	public void user_have_to_click_the_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@Then("user have to close the browser")
	public void user_have_to_close_the_browser() {
	    //driver.quit();
	}


}
