package rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class TestDriverIOSNew {
	
	public static IOSDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException{
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		driver=new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4732/wd/hub"), capabilities);
	}

}
