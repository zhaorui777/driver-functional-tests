package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.AppiumServer;
import utility.CommonUtils;


public class TestBase {

	public static AppiumDriver<MobileElement> driver;
	//public static String loadPropertyFile="IOS_dax.properties";
	public static String loadPropertyFile="Android_dax.properties";
	//public static ExcelReader excel= new ExcelReader();
	
	
	@BeforeMethod
	public void setUp() throws IOException{
		if(driver==null){
			AppiumServer.start();
			//log.debug("Appium server started");
			System.out.println("Appium server start");
			
			
			if(loadPropertyFile.startsWith("IOS")){
				CommonUtils.loadIOSConfProp(loadPropertyFile);
				CommonUtils.setIOSCapabilites();
				driver= CommonUtils.getIOSDriver();
				
			}else if(loadPropertyFile.startsWith("Android")){
				// Change the content from 'IOS' to 'Android' and need to coressponding files
				CommonUtils.loadAndroidConfProp(loadPropertyFile);
				CommonUtils.setAndroidCapabilites();
				driver= CommonUtils.getAndroidDriver();
			}
		}
		
	}
	
	@AfterMethod
	public void tearDown(){
//		AppiumServer.stop();
		//log.debug("Appium server stopped");
		System.out.println("Appium server stopped");
		driver.quit();
	}
	
}
