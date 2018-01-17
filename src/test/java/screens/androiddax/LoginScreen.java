package screens.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends ScreenBase{
	@AndroidFindBy(id="com.grabtaxi.driver2:id/sign_in")
	public WebElement signInBtn;
	
	@AndroidFindBy(id="android.widget.TextView")
	public WebElement signInWithDiffAccBtn;
	
	@AndroidFindBy(id="com.google.android.gms:id/account_name")
	public WebElement chooseAccBtn;
	
	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
    public void login() throws Exception{
	    
	    try{
	    	wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
	    	signInBtn.click();
	    }
	    catch(Exception e){
	    	logger.error("No signInBtn!");
	    }
	    
	    try{
	    	wait.until(ExpectedConditions.elementToBeClickable(signInWithDiffAccBtn));
	    	signInWithDiffAccBtn.click();
	    }
	    catch(Exception e){
	    	logger.error("No signInWithDiffAccBtn!");
	    }
	    try{
	    	wait.until(ExpectedConditions.elementToBeClickable(chooseAccBtn));
	    	chooseAccBtn.click(); 
	    }
	    catch(Exception e){
	    	logger.error("No chooseAccBtn");
	    }
	    
    }
}
