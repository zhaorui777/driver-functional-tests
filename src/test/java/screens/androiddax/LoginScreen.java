package screens.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends ScreenBase{
	
	
	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
    public void login() throws Exception{
	    
	    try{
			driver.findElement(MobileBy.id("com.grabtaxi.driver2:id/sign_in")).click();
	    }
	    catch(Exception e){
	    }
	    
	    try{
	    	Thread.sleep(5000);
			driver.findElements(MobileBy.className("android.widget.TextView")).get(3).click();
	    }
	    catch(Exception e){
	    }
	    try{
	    Thread.sleep(5000);
		driver.findElement(MobileBy.id("com.google.android.gms:id/account_name")).click(); //Use account 001
	    }
	    catch(Exception e){
	    	System.out.println("No element found");
	    }
	    
    }
}
