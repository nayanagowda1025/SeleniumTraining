package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchButton;
     
	@FindBy(xpath="//input[@value='Search']")
	private WebElement searchButton1;
			
	public WelcomePage(WebDriver driver) {
		
	      PageFactory.initElements(driver, this);

	}
	

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	

}
