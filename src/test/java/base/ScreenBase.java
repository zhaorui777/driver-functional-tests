package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenBase {

	public AppiumDriver<MobileElement> driver;
	public static Wait wait;
	
	public ScreenBase(AppiumDriver<MobileElement> driver){
		TestBase testBase=new TestBase();
		this.driver=testBase.driver;
		
		wait = new FluentWait(driver)
		        .withTimeout(10, TimeUnit.SECONDS)
		        .pollingEvery(250, TimeUnit.MILLISECONDS)
		        .ignoring(NoSuchElementException.class)
		        .ignoring(TimeoutException.class);
	}
	
	public void hideKeyboard(){
		driver.hideKeyboard();
	}
	
	
	
}
