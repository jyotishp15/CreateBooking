package createBooking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPage extends Page {
	


	@Test
	public void logIn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		File f=new File("D:\\student\\TestCase.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook workbook=WorkbookFactory.create(fi);
		
		Sheet sheet0=workbook.getSheetAt(0);
	    Row row0=sheet0.getRow(1);
		Cell cell=row0.getCell(1);
		Cell cell1=row0.getCell(2);
		Cell cell2=row0.createCell(3);
		String username=cell.getStringCellValue();
		String password=cell1.getStringCellValue();
		HomePage hm=new HomePage();
		hm.doLogin(username,password);
		

		CreateBooking cb=new CreateBooking();
		cb.createBooking();
		
		
		MakeCorrection mk=new MakeCorrection();
		mk.makeCorrection();
		
		Thread.sleep(5000);
		cell2.setCellValue("pass");
	    FileOutputStream fo=new FileOutputStream(f);
		
		workbook.write(fo);
		
		fo.close();
		driver.close();
	
	     
		fi.close();
		
	}
}
