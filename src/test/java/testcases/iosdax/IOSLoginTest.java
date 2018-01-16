package testcases.iosdax;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.iosdax.LoginScreen;

public class IOSLoginTest extends TestBase{
	LoginScreen loginScreen;
	
	@BeforeTest
	public void init(){
		super.loadPropertyFile="IOS_dax.properties";
		System.out.println("LoginTest init()");
	}
	
	@Test(priority=1)
	public void login(){
		loginScreen= new LoginScreen(driver);
		
		loginScreen.termsAgree();
	}
}
