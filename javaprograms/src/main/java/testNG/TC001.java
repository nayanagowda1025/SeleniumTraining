package testNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001 {
	@Test(priority=2)
	public void register()
	{
		Reporter.log("registered successfully",true);
	}
	@Test(priority=-1,invocationCount = 3,dependsOnMethods = "register")
	public void login()
	{
		Reporter.log("login successfully",true);
	}

}
