package screens.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
	    	wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
		    signInBtn.click();
	    }
	    catch(Exception e){
	    	System.out.println("Skipped the SignIn");
	    }
	}
	
	public void signUp(){
	    try{
	    	wait.until(ExpectedConditions.elementToBeClickable(signUpBtn));
		    signUpBtn.click();
	    }
	    catch(Exception e){
	    	System.out.println("Skipped the SignUp");
	    }
	}
	
}
