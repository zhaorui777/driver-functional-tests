package utility;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {
	
	public static AppiumDriverLocalService service;
	
	public static void start(){
		/*
		//start the appium server here (around 'Day12 1:01:00')
		service = AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder().usingDriverExecutable(new File("c://......node.exe"))
						.withAppiumJS(new File(".......appium.js"))
						.withLogFile(new File(System.getProperty("user.dir")+"\\ocuments\\Gautomation\\EclipseWorkSpace\\PageObjectModel\\test\\resources\\logs\\Appium.log")));
		service.start();
		*/
	}
	
	public static void stop(){
		service.stop();
	}

}
