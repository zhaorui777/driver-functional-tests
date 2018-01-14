package screens.inapptutor.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AcceptTutorScreen extends ScreenBase{
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/job_ad_assignment_bid")
	public WebElement acceptTutorBtn;
	
	public AcceptTutorScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	public void accept(){
		try{
	    	Thread.sleep(5000);
	    	acceptTutorBtn.click();
		}
		catch(Exception e){
			System.out.println("Skipped accept of tutorial");
		}
	}
}
