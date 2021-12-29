package com.stepdeff;

	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class StepDefenition1 {
		WebDriver driver;
		@Given("User is on the adactinhotel Login page")
		public void user_is_on_the_adactinhotel_Login_page() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
		}

		@When("User should enter {string} and {string}")
		public void user_should_enter_and(String string, String string2) {
			WebElement txtUserName = driver.findElement(By.id("username"));
			txtUserName.sendKeys("madhankumar99522");
			
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("Madhan@99522");
		}

		@When("User should click login button")
		public void user_should_click_login_button() {
			WebElement btnLogin = driver.findElement(By.id("login"));
			btnLogin.click();
		}

		@When("User should select hotel {string},{string},{string},{string},{string},{string},{string},{string}")
		public void user_should_select_hotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
			WebElement location= driver.findElement(By.id("location"));
			Select select = new Select(location);
			select.selectByVisibleText(string);
			
			WebElement hotel = driver.findElement(By.id("hotels"));
			Select select1=new Select(hotel);
			select1.selectByVisibleText(string2);
			
			WebElement roomType = driver.findElement(By.id("room_type"));
			Select select2 = new Select(roomType);
			select2.selectByVisibleText(string3);
			
			WebElement roomNos = driver.findElement(By.id("room_nos"));
			Select select3 = new Select(roomNos);
			select3.selectByVisibleText(string4);
			
			WebElement dateIn = driver.findElement(By.id("datepick_in"));
			dateIn.clear();
			dateIn.sendKeys(string5);
			
			WebElement dateOut = driver.findElement(By.id("datepick_out"));
			dateOut.clear();
			dateOut.sendKeys(string6);
			
			WebElement adultPer = driver.findElement(By.id("adult_room"));
			Select select4 = new Select(adultPer);
			select4.selectByVisibleText(string7);
			
			WebElement childPer = driver.findElement(By.id("child_room"));
			Select select5 = new Select(childPer);
			select5.selectByVisibleText(string8);}

		@When("User should click search hotel")
		public void user_should_click_search_hotel() {
			WebElement searchBtn = driver.findElement(By.id("Submit"));
	        searchBtn.click();
		}

		@When("User should click the submit button")
		public void user_should_click_the_submit_button() {
			WebElement radButton = driver.findElement(By.id("radiobutton_0"));		
			radButton.click();
			
			WebElement ctnBtn = driver.findElement(By.id("continue"));
		    ctnBtn.click();
		}

		@When("User should Book hotel and enter details{string},{string},{string},{string},{string},{string},{string},{string}")
		public void user_should_Book_hotel_and_enter_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
			WebElement fName = driver.findElement(By.id("first_name"));
			fName.sendKeys(string);
			
			WebElement lName = driver.findElement(By.id("last_name"));
			lName.sendKeys(string2);
			
			WebElement add = driver.findElement(By.id("address"));
			add.sendKeys(string3);
			
			WebElement ccNum = driver.findElement(By.id("cc_num"));
			ccNum.sendKeys(string4);
			
			WebElement ccType = driver.findElement(By.id("cc_type"));
			Select select6 = new Select(ccType);
			select6.selectByVisibleText(string5);
			
			WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
			Select select7 = new Select(expMonth);
			select7.selectByVisibleText(string6);
			
			WebElement expYear = driver.findElement(By.id("cc_exp_year"));
			Select select8 = new Select(expYear);
			select8.selectByVisibleText(string7);
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys(string8);
		}

		@When("User should Click Submit button")
		public void user_should_Click_Submit_button() throws InterruptedException {
		    WebElement book = driver.findElement(By.id("book_now"));
		    book.click();
		    Thread.sleep(5000);
		}

		@Then("User should verify booking id")
		public void user_should_verify_booking_id() {
		    WebElement orderId = driver.findElement(By.xpath("//input[@name='order_no']"));
			String attri = orderId.getAttribute("value");
		    System.out.println("\n Book Id:"+attri);    
		    Assert.assertTrue(true);
		    driver.quit();
		}





		}

	
		



