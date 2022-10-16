package org.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitons3 extends Baseclass {
	@Given("user needs to be in flipkart homepage")
	public void user_needs_to_be_in_flipkart_homepage() {
		
		   geturl(" https://www.flipkart.com/account/login");
		   maximize();
	}

	@When("user should enter product name in searchbox")
	public void user_should_enter_product_name_in_searchbo(io.cucumber.datatable.DataTable d) {
	    List<Map<String, String>> s = d.asMaps();
		WebElement searchbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fillbox(searchbox,s.get(0).get("New product"));
		
	}

	@When("user should click search button")
	public void user_should_click_search_button() {
	   WebElement searchbtn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	   searchbtn.click();
	}

	@Then("user will navigaye to products page")
	public void user_will_navigaye_to_products_page() {
	   System.out.println("User is in products page");
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
