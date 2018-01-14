package testcases.iosdax;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.iosdax.LoginScreen;

public class LoginTest extends TestBase{
	LoginScreen loginScreen;
	
	@BeforeTest
	public void init(){
		loginScreen= new LoginScreen(driver);
	}
	
	@Test(priority=1)
	public void login(){
		loginScreen.termsAgree();
	}
}
