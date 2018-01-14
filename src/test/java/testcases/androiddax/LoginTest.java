package testcases.androiddax;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.androiddax.AgreeScreen;
import screens.androiddax.ChooseAccScreen;
import screens.androiddax.LoginScreen;
import screens.androiddax.SignInNSignUpScreen;
import screens.androiddax.SignInOptScreen;

public class LoginTest extends TestBase{

	AgreeScreen agreeScreen;
	SignInNSignUpScreen signInNSignUpScreen;
	SignInOptScreen signInOptScreen;
	ChooseAccScreen chooseAccScreen;
	
	
	/*
	@BeforeTest
	public void init(){
		System.out.println("LoginTest init()");
	}*/
	
	@BeforeTest
	public void init(){
		System.out.println("LoginTest init()");
	}
	
	@Test
	public void login() throws Exception{

		if(loadPropertyFile.startsWith("IOS")){
			
		}else if(loadPropertyFile.startsWith("Android")){
		agreeScreen= new AgreeScreen(driver);
		signInNSignUpScreen= new SignInNSignUpScreen(driver);
		signInOptScreen= new SignInOptScreen(driver);
		chooseAccScreen = new ChooseAccScreen(driver);
		
		agreeScreen.agree();
		signInNSignUpScreen.signIn();
		signInOptScreen.signInDeviceOpt();
		//chooseAccScreen.chooseAcc();
		}
	
	}
}
