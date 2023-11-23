package programElement;

import java.util.ArrayList;



	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class split_String {
		
		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\AppData\\Roaming\\fire-flink-client\\localnode\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
			 
			
			
			driver.get("https://bus.ixigo.com/bus_search/Bangalore/7/Jamkhandi/1621/20-11-2023/O");
			driver.manage().window().maximize();
			Thread.sleep(50000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			System.out.println("Wait Completed");
			//"Price Drop;Bus Type:Non AC:Seater;Departure Time:Before 10 AM:10 AM - 5 PM;Bus Partner:Royal Travels;Boarding Point:8th Mile;Dropping Point:Jamakhandi Bus Stand;";
			
		    String input = "Dashboard;Product:Product List(Delete, Create);";

		    String[] parts = input.split(";");

		    for (int i = 0; i < parts.length; i++) {
		        String sentence = parts[i];
		        String[] words = sentence.split("[:]");
		       
		        int wordCount = words.length;
		        String stageOneword="";
		        String stageTwoword="Dashboard;Product:Product List(Delete, Create);";
		        
		        
		        if (wordCount == 1) {
		        	stageOneword=words[0];
		           // System.out.println(stageOneword);
		        	Thread.sleep(2000);
		            String firstXpath = "//div[@class='akc-content-accordation-inner']//span[text()='"+stageOneword+"']//div[@class='custom-checkbox select-all ']/input";
		            WebElement element= driver.findElement(By.xpath(firstXpath));
		            
		            if (element.isDisplayed()) {
	                    element.click();
	                } 
		            else {
		            	
		            	executor.executeScript("arguments[0].scrollIntoView(true);", element);
	                    
	                    element.click();
	                }
		        }

		        else if (wordCount > 1) {
		         
		            	stageOneword=words[0];
		            	stageTwoword=words[1];
		            	
		            	Thread.sleep(2000);
		            	String secondXpath="//div[@class='akc-content-accordation-inner']//span[text()='"+stageOneword+"']//div[@class='custom-checkbox select-all ']/input/ancestor::div[@class='media-body']//b[text()='"+stageTwoword+"']/preceding-sibling::div";
		            	WebElement toggleButton= driver.findElement(By.xpath(secondXpath));
		            	
		            	  if (toggleButton.isDisplayed()) {
		            		  
		            	      executor.executeScript("arguments[0].click();", toggleButton);
			                } 
				            else {
				            	 
				            	Thread.sleep(3000);
				            	executor.executeScript("arguments[0].scrollIntoView(true);", toggleButton);  
				            	executor.executeScript("window.scrollBy(0, 500);", toggleButton);

				      		  Thread.sleep(2000);
				      		 
		            	      executor.executeScript("arguments[0].click();", toggleButton);
			                }
		            
			            	 for (int k = 2; k < wordCount; k++) {
			            	        String stageThreeword = words[k];
			            	        System.out.println(stageThreeword);
			            	        Thread.sleep(2000);
			            	        String thirdXpath="//div[@class='akc-content-accordation-inner']//span[text()='"+ stageOneword +"']//div[@class='custom-checkbox select-all ']/input/ancestor::div[@class='media-body']//b[text()='"+stageTwoword+"']/preceding-sibling::div/ancestor::p//label[text()='"+stageThreeword+"']/preceding-sibling::input";
			            	        Thread.sleep(2000);
			            	        WebElement checkbox = driver.findElement(By.xpath(thirdXpath));
			            	        
			            	        if (checkbox.isDisplayed()) {
			            	        	checkbox.click();
			    	                } 
			    		            else {
			    		            	Thread.sleep(2000);
			    		            	executor.executeScript("arguments[0].scrollIntoView(true);", checkbox);
			    	                   // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200);", checkbox);

			    	                    Thread.sleep(2000);
			    	                    // Click on the element
			    	                    checkbox.click();
			    	                }
			            	        
			            	    
			            	 }
			       
		            }
		        }
		        
		    
		}
	}
		
