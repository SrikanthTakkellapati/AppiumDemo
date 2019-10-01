package tests;

import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setUp() 
	{
		try
		{
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
			dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			dc.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
			driver = new AppiumDriver<MobileElement>(url,dc);
			//driver = new AndroidDriver<MobileElement>(url,dc);

		}catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void sampleTest() 
	{
		System.out.println("sample test");
		
	}

	@AfterTest
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
}
