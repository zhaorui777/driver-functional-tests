package screens.androiddax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StillNotDone_____ScreenHome extends ScreenBase{
	@AndroidFindBy(id="com.grabtaxi.driver2:id/home_toolbar_center_icon")
	public WebElement serverConnHomeBtn;
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/home_toolbar_availability_toggle")
	public WebElement toggleHomeBtn;

	@AndroidFindBy(id="com.grabtaxi.driver2:id/home_toolbar_menu")
	public WebElement menuHomeBtn;

	@AndroidFindBy(id="com.grabtaxi.driver2:id/incentive_layout")
	public WebElement incentivesHomeBtn;
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/home_top_up_pax_btn")
	public WebElement paymentHomeBtn;
	
	@AndroidFindBy(id="com.grabtaxi.driver2:id/home_bottom_sheet_view")
	public WebElement foldTypeHomeBtn;
	
	public StillNotDone_____ScreenHome(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	}
	
	/*
	
	public void toggle(){
		try{
	    	Thread.sleep(5000);
	    	toggleHome.click();
		}
		catch(Exception e){
			System.out.println("Skipped toggleHome of tutorial");
		}
	}
	*/

}
