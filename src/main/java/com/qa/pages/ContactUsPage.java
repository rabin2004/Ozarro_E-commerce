package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactUsPage extends TestBase {
	
	
	  
	public ContactUsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	
	}
	   @FindBy(xpath="//li[@id='menu-item-2077']//a[text()='Contact Us']")
	  WebElement clickcontactus;
	
	   public void click() {
		   clickcontactus.click();
	   }	   
			
	   @FindBy(name="your-name")
		  WebElement typeName; 
	   
	   public void name() {
	  typeName.sendKeys("Robin");   
			   
	   }   
	   @FindBy(name="your-email")
		  WebElement typeEmail; 
	   
	   public void email() {
		   typeEmail.sendKeys("abc123@gmail.com");  
	   }	   
 
	   @FindBy(name="your-subject")
		  WebElement typeSubject; 
	   
	   public void subject() {
		   typeSubject.sendKeys("address update"); 
	   }
	   
	   @FindBy(name="your-message")
		  WebElement typeMessage; 
	   
	   public void message() {
		   typeMessage.sendKeys("please update my address");
	   }
	   
	   @FindBy(css=".wpcf7-form-control.wpcf7-submit")
		  WebElement clickSend; 
	   
	   public void send() {
		  clickSend.click();
	   }
	   
	   @FindBy(name="your-email")
		  WebElement typeInvalidEmail; 
	   
	   public void invaliEmail() {
		   typeEmail.sendKeys("abc123@gcom");  
	   }	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
