package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestValidLogin extends BaseTest{
	
	@Test(priority=1)
	public void ValidLogin() throws InterruptedException {
		String un = XL.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw=XL.getData(XL_PATH, "ValidLogin", 1, 1);
		String title=XL.getData(XL_PATH, "ValidLogin", 1, 2);
		
		LoginPage l=new LoginPage(driver);
		
		l.setUN(un);
		l.setPW(pw);
		l.clickLogin();
		Thread.sleep(1000);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyHomePageDisplayed(title, ETO, driver);
	}

}
