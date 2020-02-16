package SampleMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.1.0");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void elementsUI()
	{
		System.out.println("elementsUI");
	}
	
}
