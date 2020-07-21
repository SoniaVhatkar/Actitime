package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBTN;
	
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement errMSG;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUN(String un) {
		unTB.sendKeys(un);
	}
	
	public void setPW(String pw) {
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin() {
		lgnBTN.click();
	}
	
	public void verifyErrorMsgDisplayed() {
		
		boolean abc = errMSG.isDisplayed();
		Assert.assertTrue(abc);
	}

}
