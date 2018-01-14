package screens.iosdax;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSFindBys;

public class LoginScreen extends ScreenBase{
	
	/* In order to choose the multiple elements and count the element number
	@iOSFindBys({
		@iOSFindBy(id="the first layer"),
		@iOSFindBy(className="the 2nd layer"),
	})
	public List<WebElement> btn;
	
	//甚至可以用 'btn.size();' 拿到element数量
	*/

	@iOSFindBy(id="com.grabtaxi.driver2:id/terms_agree")
	public WebElement termsAgree;
	
	@iOSFindBy(id="com.grabtaxi.driver2:id/footer_sign_in_with_diff_acc")
	public WebElement signDiffAcc;
	
	@iOSFindBy(id="com.grabtaxi.driver2:id/sign_in")
	public WebElement signIn;

	@iOSFindBy(id="com.google.android.gms:id/account_name")
	public List<WebElement> chooseAcc;
	
	
	
	public LoginScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
	}
	
	public void termsAgree(){
	    try{
		    termsAgree.click();
	    }
	    catch(Exception e){
	    }	    
	}
	
	public void signDiffAcc(){
	    try{
		    signDiffAcc.click();
	    }
	    catch(Exception e){
	    }
	}
	
	public void signIn() throws Exception{
	    
	    try{
			signIn.click();
	    }
	    catch(Exception e){
	    }
	}
	    
	    /*
	    try{
	    	Thread.sleep(5000);
			driver.findElements(MobileBy.className("android.widget.TextView")).get(3).click();
	    }
	    catch(Exception e){
	    }*/
	    
	    public void chooseAcc(){
		    try {
				Thread.sleep(5000);
			    chooseAcc.get(5).click(); //Use account 001
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    
    
	}


