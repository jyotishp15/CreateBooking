package createBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	 public static WebDriver driver;
	
	 
	 public Page(){
	
		if (driver==null){
	    driver=new FirefoxDriver();
		
		driver.get("https://www.cvt.inttra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	}
}
