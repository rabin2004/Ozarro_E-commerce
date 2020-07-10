package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

     public class ShopPage extends  TestBase{
	 public ShopPage(WebDriver driver){
	 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath="//*[@id=\"woocommerce_product_search-1\"]/form/button")
	 WebElement searchbutton;
	 
	 public  WebElement searchbutton() {
	 return searchbutton;}
	 
	 @FindBy(id="woocommerce-product-search-field-0")
	 WebElement searchbox;
	 
	 public  WebElement searchbox() {
	 return searchbox;}
	 
	 
	 
}










