package createBooking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateBooking extends Page{
	
		
	
@Test
public void createBooking() throws InterruptedException{
	

	//Thread.sleep(2000);
	WebElement bkElement=driver.findElement(By.linkText("Booking"));
	Actions action=new Actions(driver);
   action.moveToElement(bkElement).build().perform();
//Thread.sleep(2000);
WebElement crBkElement=driver.findElement(By.linkText("Create New Booking"));
crBkElement.click();

	//byIndex
//Thread.sleep(5000);
	WebElement carrierElement=driver.findElement(By.cssSelector("select[name='formValues.carrier']"));
	
	Select carrierSelect=new Select(carrierElement);
	carrierSelect.selectByVisibleText("TESTCARRIER EDI 2");
	
	
	 // checkBox = driver.findElement(By.xpath("//*[@id='myrole_shipper']"));
			 
	 
	WebElement checkBox1 = driver.findElement(By.cssSelector("input[id='myrole_forwarder']"));
	checkBox1.click();

	 WebElement ref=driver.findElement(By.xpath("//*[@id='shipperRefNo']"));
ref.sendKeys("TESTJP110");
	
	WebElement moveTypeElement=driver.findElement(By.cssSelector("select[id='moveType']"));
	Select portSelect=new Select(moveTypeElement);
	portSelect.selectByVisibleText("Port, Ramp or CY to Port, Ramp or CY");
	
	//Thread.sleep(1000);
	WebElement por= driver.findElement(By.cssSelector("input[id='receiptPort']"));
	por.sendKeys("indel");
	Thread.sleep(1000);
	action.sendKeys(por).sendKeys(Keys.RETURN).build().perform();
	
	//Thread.sleep(1000);
	WebElement dtClr=driver.findElement(By.xpath("//*[@id='etd']"));
	dtClr.clear();
	//Thread.sleep(1000);
	dtClr.sendKeys("24-Dec-2016");
		
	//Thread.sleep(1000);
	WebElement por1= driver.findElement(By.cssSelector("input[id='loadPort']"));
	por1.sendKeys("indel");
	Thread.sleep(1500);
	action.sendKeys(por1).sendKeys(Keys.RETURN).build().perform();
	
	//Thread.sleep(1000);
	WebElement por2= driver.findElement(By.cssSelector("input[id='deliveryPort']"));
	por2.sendKeys("inbom");
	Thread.sleep(1000);
	action.sendKeys(por2).sendKeys(Keys.RETURN).build().perform();
	
	//Thread.sleep(1000);
	WebElement por3= driver.findElement(By.cssSelector("input[id='dischargePort']"));
	por3.sendKeys("inbom");
	Thread.sleep(1000);
	action.sendKeys(por3).sendKeys(Keys.RETURN).build().perform();
	
	
	driver.findElement(By.name("cargoInfoList[0].desc")).sendKeys("cargo aaaa");
	WebElement ab=driver.findElement(By.cssSelector("input[class='form_fielddata container-combobox-width form_txt ui-autocomplete-input']"));
	ab.sendKeys("25G0");
	//Thread.sleep(2000);
	action.sendKeys(ab).sendKeys(Keys.DOWN).sendKeys(Keys.RETURN).build().perform();
	
	driver.findElement(By.xpath("//*[@id='partnerNotification']")).sendKeys("jyotish.phukon@inttra.com");
	driver.findElement(By.xpath("//*[@id='bookNowButton']")).click();
	//Select element by Value
  
	}


}
