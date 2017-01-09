package createBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage extends Page {

	
	
	@Test
	public void doLogin(String userame,String passord) throws InterruptedException{
		
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(userame);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(passord);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
	}
	
}
