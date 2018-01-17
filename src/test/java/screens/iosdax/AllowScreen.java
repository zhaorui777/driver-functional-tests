package screens.iosdax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AllowScreen extends ScreenBase{
	
	@FindBy(how=How.XPATH,using=("//XCUIElementTypeButton[@name=\\\"Allow\\\"]"))
	public WebElement allowBtn;
	
	public AllowScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
    public void allowNoti() throws Exception{
    	while(allowBtn.isDisplayed()){
                alert.accept();
                Thread.sleep(5000);
//        		passengerAppDriver.findElement(allowBtn);
    	}
    }
    
    
    
}
