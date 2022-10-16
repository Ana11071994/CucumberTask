package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends Baseclass {
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {
	  
	   geturl("https://www.facebook.com/");
	   maximize();
	}

	@When("user should enter invalid {string} and {string}")
	public void user_should_enter_invalid_and(String user , String pass) {
		WebElement userid = driver.findElement(By.id("email"));
		fillbox(userid, user);
		WebElement passwd = driver.findElement(By.id("pass"));
		fillbox(passwd, pass);
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	  
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
	  System.out.println("user is in invalid credntial page");
	 
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
