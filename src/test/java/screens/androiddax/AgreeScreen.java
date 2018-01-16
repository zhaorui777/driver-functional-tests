package screens.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.thoughtworks.selenium.Wait;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AgreeScreen extends ScreenBase{
	@AndroidFindBy(id="com.grabtaxi.driver2:id/terms_agree")
	public WebElement agreeBtn;
	
	
	public AgreeScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	
    public void agree() throws Exception{
	    try{
	    	this.wait.until(ExpectedConditions.elementToBeClickable(agreeBtn));
		    agreeBtn.click();
	    }
	    catch(Exception e){
	    	System.out.println("Can't find agreeBtn");
	    }	   
    }
}
