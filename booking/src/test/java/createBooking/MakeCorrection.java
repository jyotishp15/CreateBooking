package createBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class MakeCorrection extends Page{
			
			
        @Test
		public void makeCorrection() throws InterruptedException {
        	Thread.sleep(20000);
			WebElement mCorElement=driver.findElement(By.cssSelector("input[id='makecorrections']"));
			mCorElement.click();
			WebElement commElemet=driver.findElement(By.cssSelector("textarea[id='customerComment']"));
			commElemet.sendKeys("This is a Test booking automated by JSlnium");
		       
			driver.findElement(By.xpath("//*[@id='bookNowButton']")).click();
			
			
        }
					
	}


