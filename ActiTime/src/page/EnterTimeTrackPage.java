package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHomePageDisplayed(String title,long time,WebDriver driver) {
		
		WebDriverWait wait=new WebDriverWait(driver,time );
		
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home page is Displayed");
		}catch (Exception e) {
			Reporter.log("Home page is not displayed");
		}
	}

}
