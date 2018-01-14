package screens.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInNSignUpScreen extends ScreenBase{

	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/sign_in")
	public WebElement signInBtn;
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/sign_up")
	public WebElement signUpBtn;
	
	public SignInNSignUpScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	public void signIn(){
	    try{
	    	Thread.sleep(5000);
		    signInBtn.click();
	    }
	    catch(Exception e){
	    	System.out.println("Skipped the SignIn");
	    }
	}
	
	public void signUp(){
	    try{
	    	Thread.sleep(5000);
		    signUpBtn.click();
	    }
	    catch(Exception e){
	    	System.out.println("Skipped the SignUp");
	    }
	}
	
}
