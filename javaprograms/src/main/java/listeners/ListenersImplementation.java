package listeners;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation  extends BaseClass implements ITestListener{
    
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started...",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success...",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/listener.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
