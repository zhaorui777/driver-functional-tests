package screens.inapptutor.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NewJobOkTutorScreen extends ScreenBase{
	/*
	@FindBy(how=How.XPATH,using=("//android.widget.TextView[@text='OK']"))//class:android.widget.Button, id:android:id/button1
	public WebElement newJobOkTutorBtn;
	*/
	

	@AndroidFindBy(id="android:id/button1")
	public WebElement newJobOkTutorBtn;
	
	public NewJobOkTutorScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	public void newJobOk(){
		try{
	    	Thread.sleep(5000);
			newJobOkTutorBtn.click();
		}
		catch(Exception e){
			System.out.println("Skipped new job ok of tutorial");
		}
	}
	
}
