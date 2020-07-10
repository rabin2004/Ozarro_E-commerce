package com.qa.base;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mona0\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ozarro.shop/?s=&post_type=product");
		driver.manage().window().maximize();
		
		
	WebElement wb = driver.findElement(By.xpath("//div[@class='price_slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']//span[1]"))	;
	Actions ml=new Actions(driver);
	ml.dragAndDropBy(wb,100,0).build().perform();
		
		
		
		
		
		
		
		
		
	}

}
