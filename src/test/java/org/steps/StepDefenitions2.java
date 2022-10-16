package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitions2 extends Baseclass {


	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	   
	}

	@Then("user will redirect to invalid credential page")
	public void user_will_redirect_to_invalid_credential_page() {
		 System.out.println("user is in invalid credntial page");
		  
	}

}
