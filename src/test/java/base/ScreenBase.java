package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenBase {

	public AppiumDriver<MobileElement> driver;
	
	public ScreenBase(AppiumDriver<MobileElement> driver){
		TestBase testBase=new TestBase();
		this.driver=testBase.driver;
	}
	
	public void hideKeyboard(){
		driver.hideKeyboard();
	}
	
}
