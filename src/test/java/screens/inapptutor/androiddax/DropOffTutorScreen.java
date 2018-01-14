package screens.inapptutor.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DropOffTutorScreen extends ScreenBase{
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/onjob_dropoff_btn")	
	public WebElement dropOffTutorBtn;
	
	public DropOffTutorScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	public void accept(){
		try{
	    	Thread.sleep(5000);
	    	dropOffTutorBtn.click();
		}
		catch(Exception e){
			System.out.println("Skipped dropOffTutorBtn of tutorial");
		}
	}

}
