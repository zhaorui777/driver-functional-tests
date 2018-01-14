package rough;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestDriverIOS {
	static DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	static URL passengerAppServerAddress;
	public static AppiumDriver<WebElement> passengerAppDriver;
	
    public static void configAppium() throws Exception{
    	
    	boolean isSimulator = false;
    	desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        desiredCapabilities.setCapability("autoAcceptAlerts", true);

        desiredCapabilities.setCapability("useNewWDA", true);

        //File app = new File(dir,"/Users/rui.zhao/Documents/Gautomation/automation-workshop-everyone/apk/Driver_1.11.0.ipa");
        //System.out.println(app.getAbsolutePath());
        if(!isSimulator){
           desiredCapabilities.setCapability(MobileCapabilityType.UDID, "a3c0daeef475281e4d3209048ba1ca648a6d0617");//iPhone7 plus

           String xcconfigPath = "/Users/rui.zhao/Documents/Gautomation/automation-workshop-everyone/src/test/resources/grabtaxi-driver.xcconfig";
            desiredCapabilities.setCapability("xcodeConfigFile", xcconfigPath);
        }else{
            desiredCapabilities.setCapability(IOSMobileCapabilityType.LOCATION_SERVICES_ENABLED, true);
            desiredCapabilities.setCapability(IOSMobileCapabilityType.LOCATION_SERVICES_AUTHORIZED, true);
        }
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 7200);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/rui.zhao/Documents/Gautomation/automation-workshop-everyone/apk/Driver_1.11.0.ipa");

        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 60000);
        desiredCapabilities.setCapability(IOSMobileCapabilityType.SHOW_IOS_LOG, true);
        desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.grabtaxi.driver.ios");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.WAIT_FOR_APP_SCRIPT, "$.delay(5000); true;");
        desiredCapabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS,true);
    }

    
	public static void main(String[] args) throws Exception {

    	configAppium();
		passengerAppServerAddress = new URL("http://127.0.0.1:4723/wd/hub");
		passengerAppDriver = new IOSDriver<WebElement>(passengerAppServerAddress, desiredCapabilities);
		passengerAppDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

	}
	


}
