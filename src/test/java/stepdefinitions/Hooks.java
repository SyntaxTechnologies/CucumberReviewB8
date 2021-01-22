package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	WebDriver driver;
	
	@Before//run before every scenario in your project
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	}
	
	
	@After//run after every scenario in your project
	public void tearDown() {
		driver.quit();
	}
}
