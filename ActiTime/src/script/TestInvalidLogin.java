package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class TestInvalidLogin extends BaseTest {
	
	@Test(priority=2)
	public void InvalidLogin() throws InterruptedException {
		
		int rc = XL.getRowCount(XL_PATH, "InvalidLogin");
		
		for (int i = 1; i <=rc; i++) {
			String un = XL.getData(XL_PATH, "InvalidLogin", i, 0);
			String pw=XL.getData(XL_PATH, "InvalidLogin", i, 1);
			
			Reporter.log("UN:"+un);
			Reporter.log("PW:"+pw);
			
			LoginPage l=new LoginPage(driver);
			
			l.setUN(un);
			l.setPW(pw);
			l.clickLogin();
			
			Thread.sleep(1000);
			
			l.verifyErrorMsgDisplayed();
			
		}
	}

}
