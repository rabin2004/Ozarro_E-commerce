package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	 public HomePage(WebDriver driver){
	        PageFactory.initElements(driver,this);
	        }
@FindBy(id="menu-item-2021")
WebElement shoplink;
	
public WebElement shoplink(){
	return shoplink;
	}
	
	
	
	
}
