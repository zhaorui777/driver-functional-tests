package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {

	public static int IMPLICIT_WAIT_TIME;
	public static int EXPLICIT_WAIT_TIME;
	public static String BASE_PKG;
	public static String APP_PATH;
	public static String APP_ACTIVITY;
	public static String BROWSER_NAME;
	public static String PLATFORM_NAME;
	public static String PLATFORM_VERSION;
	public static String DEVICE_NAME;
	public static String APPIUM_PORT;
	public static String UDID;
	public static String AUTOMATION_NAME;
	public static URL serverUrl;
	
	private static Properties prop=new Properties();
	public static DesiredCapabilities capabilities=new DesiredCapabilities();
	
	public static AppiumDriver<MobileElement> driver;
	
	// loadAndroidProp if need. Here, I only load iOS
	
	public static void loadAndroidConfProp(String propertyFileName) throws IOException{
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName);
		prop.load(fis);
		
		// Then start to initialize the following values
		IMPLICIT_WAIT_TIME= Integer.parseInt(prop.getProperty("implicit.wait")); // change String to int
		EXPLICIT_WAIT_TIME= Integer.parseInt(prop.getProperty("explicit.wait")); // change String to int
		//APP_PATH= prop.getProperty(System.getProperty("user.dir")+"application.path");
		APP_PATH= prop.getProperty("application.path");
		BROWSER_NAME= prop.getProperty("browser.name");
		PLATFORM_NAME= prop.getProperty("platform.name");
		PLATFORM_VERSION=prop.getProperty("platform.version");
		DEVICE_NAME= prop.getProperty("device.name");
		APPIUM_PORT=prop.getProperty("appium.server.port");
		APP_ACTIVITY=prop.getProperty("application.activity");
		BASE_PKG=prop.getProperty("base.pkg");
		UDID=prop.getProperty("udid");
		AUTOMATION_NAME=prop.getProperty("automation.name");
	}
	
	public static void loadIOSConfProp(String propertyFileName) throws IOException{
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName);
		prop.load(fis);
		
		// Then start to initialize the following values
		IMPLICIT_WAIT_TIME= Integer.parseInt(prop.getProperty("implicit.wait")); // change String to int
		EXPLICIT_WAIT_TIME= Integer.parseInt(prop.getProperty("explicit.wait")); // change String to int
		APP_PATH= prop.getProperty("application.path");
		BROWSER_NAME= prop.getProperty("browser.name");
		PLATFORM_NAME= prop.getProperty("platform.name");
		PLATFORM_VERSION=prop.getProperty("platform.version");
		DEVICE_NAME= prop.getProperty("device.name");
		APPIUM_PORT=prop.getProperty("appium.server.port");
		APP_ACTIVITY=prop.getProperty("application.activity");
		BASE_PKG=prop.getProperty("base.pkg");
		UDID=prop.getProperty("udid");
		AUTOMATION_NAME=prop.getProperty("automation.name");
	}
	
	// setAndroidCap if need. Here, I only set iOS
	
	public static void setAndroidCapabilites(){
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BROWSER_NAME); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,PLATFORM_VERSION); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME); //BROWSER_NAME FROM THE INITIALIZED VALUE
		
		//Following code want to show the 'AndroidMobileCapabilityType', this type has 'APP_ACTIVITY' and 'APP_PACKAGE'
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,BASE_PKG); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,APP_ACTIVITY);
		
		capabilities.setCapability(MobileCapabilityType.APP,APP_PATH);
		capabilities.setCapability(MobileCapabilityType.UDID, UDID);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
	}
	
	
	public static void setIOSCapabilites(){
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BROWSER_NAME); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,PLATFORM_VERSION); //BROWSER_NAME FROM THE INITIALIZED VALUE
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME); //BROWSER_NAME FROM THE INITIALIZED VALUE
		
		//Following code want to show the 'AndroidMobileCapabilityType', this type has 'APP_ACTIVITY' and 'APP_PACKAGE'
		//capabilites.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,APP_PACKAGE); //BROWSER_NAME FROM THE INITIALIZED VALUE
		//capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,APP_ACTIVITY);
		
		capabilities.setCapability(MobileCapabilityType.APP,APP_PATH);
		capabilities.setCapability(MobileCapabilityType.UDID, UDID);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
	}
	
	
	// setAndroidDriver if need. Here, I only set iOS

	
	public static AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException{
		
//		serverUrl=new URL("http://localhost:"+APPIUM_PORT+"/wd/hub");
		serverUrl=new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AndroidDriver<MobileElement>(serverUrl,capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public static AppiumDriver<MobileElement> getIOSDriver() throws MalformedURLException{
	
//		serverUrl=new URL("http://localhost:"+APPIUM_PORT+"/wd/hub");
		serverUrl=new URL("http://127.0.0.1:4723/wd/hub");
		driver= new IOSDriver<MobileElement>(serverUrl,capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}
