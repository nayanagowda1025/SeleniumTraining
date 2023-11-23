package programElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeDifference {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
	    Thread.sleep(90000);
	    
	    
	    System.out.println("started");
	    
		WebElement delhi=driver.findElement(By.xpath("//span[text()='22:10']"));
		String time1=delhi.getText();
		WebElement banglore=driver.findElement(By.xpath("(//span[text()='03:20'])[1]"));
		String time2=banglore.getText();
		
		
		
SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
SimpleDateFormat outputSdf = new SimpleDateFormat("hh:mm a");

        
        try {
            
           
            
           
            Date date = sdf.parse(time1);
            
            
            String outputTime1 = outputSdf.format(date);
            Date firstTime = sdf.parse(outputTime1);
            
            System.out.println(time1);
            System.out.println(time2);
            
           
            Date date1 = sdf.parse(time2);
            String outputTime2 = outputSdf.format(date1);
            Date secondTime = sdf.parse(outputTime2);
            
            
            System.out.println(firstTime);
            System.out.println(secondTime);
            
            
            
            
            
            long timeDifference = secondTime.getTime() - firstTime.getTime();
            
            
            long minutes = timeDifference / (60 * 1000);
            long hours = minutes / 60;
            
            
            minutes %= 60;
            
            System.out.println("Time Difference: " + hours + " hours, " + minutes + " minutes");
        } catch (Exception e) {
            System.err.println("Invalid input format. Please use the format HH:mm.");
        }
		
		
	}

}
