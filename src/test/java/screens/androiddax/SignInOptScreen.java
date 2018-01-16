package screens.androiddax;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInOptScreen extends ScreenBase{
	
//	WebDriverWait wait= new WebDriverWait(driver, 5);
	
	/*
	@AndroidFindBys(value="Sign in with Device", value = { @AndroidFindBy })
	public List<WebElement> signInOptBtn;*/
	public static String signInWithDeviceOptXpath="//android.widget.TextView[@text='Sign in with Device']";
	
	@FindBy(how=How.XPATH,using=("//android.widget.TextView[@text='Sign in with Device']"))
	public WebElement signInDeviceOpt;
	
	@FindBy(how=How.XPATH,using=("//android.widget.TextView[@text='Sign in with Google']"))
	public WebElement signInGoogleOpt;
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/footer_sign_up")
	public WebElement signUpOpt;
	
	public SignInOptScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	public void signInDeviceOpt(){
		try{
	    	this.wait.until(ExpectedConditions.elementToBeClickable(signInDeviceOpt));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(signInWithDeviceOptXpath)));
			signInDeviceOpt.click();
		}
		catch(Exception e){
			System.out.println("Skipped signInDeviceOption");
		}
	}
	
	public void signInGoogleOpt(){
		try{
	    	this.wait.until(ExpectedConditions.elementToBeClickable(signInGoogleOpt));
			signInGoogleOpt.click();
		}
		catch(Exception e){
			System.out.println("Skipped signInGoogleOption");
		}
	}
	
	public void signUpOpt(){
		try{
	    	this.wait.until(ExpectedConditions.elementToBeClickable(signUpOpt));
			signUpOpt.click();
		}
		catch(Exception e){
			System.out.println("Skipped signUpOption");
		}
	}
	

}
