package base;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import screens.androiddax.AgreeScreen;

public class ScreenBase {

	public static AppiumDriver<MobileElement> driver;
	public static Wait wait;
	public static Alert alert;
	protected final static Logger logger = Logger.getLogger(ScreenBase.class);
	
	public ScreenBase(AppiumDriver<MobileElement> driver){
		TestBase testBase=new TestBase();
		this.driver=testBase.driver;
		Alert alert = driver.switchTo().alert();
		
		wait = new FluentWait(driver)
		        .withTimeout(300, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class)
		        .ignoring(TimeoutException.class);
		
		
	}
	
	public void hideKeyboard(){
		driver.hideKeyboard();
	}
	
	
	
}
