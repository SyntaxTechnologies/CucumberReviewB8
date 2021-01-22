package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearch{
	
	WebDriver driver;
	
	//@Given("user navigated to google application")
	public void navigate() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	}

	@When("user enters any text")
	public void user_enters_any_text() {
	    driver.findElement(By.name("q")).sendKeys("Maven Repository");
	}

	@When("hit enter")
	public void hit_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("result is displayed")
	public void result_is_displayed() {
	    Boolean isDisplayed=driver.findElement(By.xpath("//a[@href='www.mavenrepository.com']")).isDisplayed();
	    Assert.assertTrue(isDisplayed);
	}

	@When("click on google search button")
	public void click_on_google_search_button() {
	    driver.findElement(By.name("btnK")).click();
	}
	
}
