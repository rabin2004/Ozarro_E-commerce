package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShopPageTest extends TestBase {
	HomePage hp;
	ShopPage sp;
	Select dropdown;
	
	
	
	@Before
	public void open() {
	}

	@Given("^User enters url \"([^\"]*)\"$")
	public void user_enters_url(String arg1) {
		initialization();
		Assert.assertEquals(driver.getCurrentUrl(), arg1);
		sp=new ShopPage(driver);
	}

	@Given("^click on shop link$")
	public void click_on_shop_link() {
		hp = new HomePage(driver);
		hp.shoplink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/shop/");
	}

	@When("^user click on Headphones USB Wires product$")
	public void user_click_on_Headphones_USB_Wires_product() {
		driver.findElement(By.linkText("Headphones USB Wires")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/product/hoodie/");
	}

	@When("^user clicks on plus sign$")
	public void user_clicks_on_plus_sign() {
//		driver.findElement(By.className("quantity-spinner quantity-up")).click();
//		driver.findElement(By.className("quantity-spinner quantity-up")).click();
	}

	@Then("^number of product quantity should increased$")
	public void number_of_product_quantity_should_increased() {

	}

	@Then("^user should be able to see Headphones USB$")
	public void user_should_be_able_to_see_Headphones_USB() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/product/hoodie/");
	}

	@And("^user can type the number of quantity$")
	public void user_can_type_the_number_of_quantity() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"product-1975\"]/div[1]/div[2]/div/form/div/div[2]/div/input")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"product-1975\"]/div[1]/div[2]/div/form/div/div[2]/div/input"))
				.sendKeys("10");
		Thread.sleep(3000);
	}

	@Then("^edit box should be editable$")
	public void edit_box_should_be_editable() throws InterruptedException {
		

	}

	@When("^user clicks on search button$")
	public void user_clicks_on_search_button() throws InterruptedException {
		sp.searchbox().sendKeys("zxc");
		Thread.sleep(3000);
		sp.searchbutton().click();
		Thread.sleep(3000);
		
	}

	@Then("^user should see list of products$")
	public void user_should_see_list_of_products() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/?s=zxc&post_type=product");
	}



	 @When("^user types on laptop$")
	    public void user_types_on_laptop() throws InterruptedException {
		    sp.searchbox().sendKeys("laptop");
			Thread.sleep(3000);
	    }
	 
	     @And("^user presses enter key$")
	    public void user_presses_enter_key() throws InterruptedException {
	    	 sp.searchbox().sendKeys(Keys.ENTER);
	    	 Thread.sleep(3000);
	    }
	     
	    @Then("^user should see search results contains word laptop$")
	    public void user_should_see_search_results_contains_word_laptop() {
	    	Assert.assertEquals(driver.getCurrentUrl(), "https://ozarro.shop/?s=laptop&post_type=product");
	    }

	    @When("^user click on Headphones USB Wires product2$")
	    public void user_click_on_headphones_usb_wires_product2() {
	    	driver.findElement(By.linkText("Laptop R752LJ 17,3” 5200U 4GB 1TB")).click();
	    }
	    
	    @And("^user can add  the number of quantity using add to cart$")
	    public void user_can_add_the_number_of_quantity_using_add_to_cart() throws InterruptedException {
	    	Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"product-1979\"]/div[1]/div[2]/div/form/div/input")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"product-1979\"]/div[1]/div[2]/div/form/div/input")).sendKeys("10");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"product-1979\"]/div[1]/div[2]/div/form/button")).click();
	    }
	    
	    @Then("^user should find the number of quantity on the cart box$")
	    public void user_should_find_the_number_of_quantity_on_the_cart_box() throws InterruptedException {
	    	driver.navigate().back();
	    	driver.navigate().back();
	    	Thread.sleep(5000);
	    	String a=driver.findElement(By.xpath("//*[@id=\"woocommerce_widget_cart-1\"]/div/ul/li/span")).getText();
	    	Assert.assertEquals(a, "10 × £1,100.00");
	    }
	    
	    @When("^user clicks on dropdown below the black bar$")
	    public void user_clicks_on_dropdown_below_the_black_bar() throws InterruptedException {
	    Select dropdown= new Select(driver.findElement(By.name("orderby")));
	    dropdown.selectByVisibleText("Sort by price: low to high");	
	    Thread.sleep(3000);
	    }

	    @And("^user clicks on Sort by price: low to high$")
	    public void user_clicks_on_sort_by_price_low_to_high() {
	   
	    }
	    
	    @Then("^product list should be sorted by price from low to high$")
	    public void product_list_should_be_sorted_by_price_from_low_to_high() {
	    	String highest ="2,299.00";
	    	String lowest ="11.05";
	    	String exp_low =driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]/div/div/div[2]/div/ul/li[1]/div/div[2]/div[2]/div[1]/span/ins/span/text()"))
.getText();	    	
	    	String exp_high=driver.findElement(By.xpath("//*[@id=\"content\"]/section[2]/div/div/div[2]/div/ul/li[17]/div/div[2]/div[2]/div[1]/span/span/text()")).getText();	 
	    	System.out.println(exp_low);
	    }

	   
	    
	    
	    
		@After
		public void close() {
		driver.quit();

		}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
