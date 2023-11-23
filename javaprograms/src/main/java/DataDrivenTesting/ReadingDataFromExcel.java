package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./testdata/shoppersstack.xlsx");
        Workbook wb=WorkbookFactory.create(fis);
      String username=  wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
      String password=  wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
     WebDriver driver= new ChromeDriver();
     driver.get("https://shoppersstack.com/user-signin");
     driver.findElement(By.id("Email")).sendKeys(username);
     
   //  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(password);
     
      
	}

}
