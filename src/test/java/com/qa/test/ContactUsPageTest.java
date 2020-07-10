package com.qa.test;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.ContactUsPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ContactUsPageTest extends TestBase{
     public ContactUsPage cp;
	
     @Before
	   public void openBrowser() {
		initialization();
		cp = new ContactUsPage(driver);
	}
	
	@Given("^user launch browser$")
	public void user_launch_browser() {
		
}
    @And("^user enters url to land in homepage$")
	public void user_enters_url_to_land_in_homepage()  {
	 Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/");   
	}

	@When("^user clicks contact us link$")
	public void user_clicks_contact_us_link() {
	   cp.click(); 
	}

	@And("^user lands in contact us page$")
	public void user_lands_in_contact_us_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/contact-us/"); 
		
	}

	@And("^user fills contact us form with valid credentials$")
	public void user_fills_contact_us_form_with_valid_credentials() {
	   cp.name();
	   cp.email();
	   cp.subject();
	   cp.message();
	   
	  }

	@Then("^user clicks send button$")
	public void user_clicks_send_button() {
		cp.send();
	   boolean sendButton =driver.findElement(By.cssSelector(".wpcf7-form-control.wpcf7-submit")).isEnabled();
	   Assert.assertTrue(sendButton);
	}

	@And("^user sees that message send is successful$")
	public void user_sees_that_message_send_is_successful() {
		
	boolean errorMessage= driver.findElement(By.xpath("//div[@class=\"wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng\"]")).isDisplayed();
	Assert.assertTrue(errorMessage);
	}

	@When("^user fills contact us form with invalid credentials$")
	public void user_fills_contact_us_form_with_invalid_credentials()  {
	 cp.name();
	 cp.invaliEmail();
	 cp.subject();
	 cp.message();
	 cp.click();
	}

	@Then("^user sees that message send is unsuccessful$")
	public void user_sees_that_message_send_is_unsuccessful() {
     boolean errorMessage= driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).isDisplayed();
     Assert.assertTrue(errorMessage); 
	}

	@When("^user doesnot fills contact us form$")
	public void user_doesnot_fills_contact_us_form() {
	   cp.click(); 
	}

	@Then("^error message is displayed$")
	public void error_message_is_displayed()  {
	    
		boolean erorMessage =driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).isDisplayed();
		Assert.assertTrue(erorMessage); 	
	}

   @After
     public void close() {
     terminateBrowser();
	
 }
	
	
	
	
}
