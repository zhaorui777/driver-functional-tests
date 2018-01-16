package screens.androiddax;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChooseAccScreen extends ScreenBase{
	@AndroidFindBy(className="android.widget.LinearLayout")
	public List<WebElement> chooseAccBtn;
	
	public ChooseAccScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);	
	}
	
	public void chooseAcc(){
		try{
	    	this.wait.until(ExpectedConditions.elementToBeClickable(chooseAccBtn.get(0)));
			chooseAccBtn.get(0).click();
		}
		catch(Exception e){
			System.out.println("Failed to choose account");
		}
		
	}
	
}
