package expense_tracker_core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;


public class BaseSetup {
	public static AndroidDriver driver;
	DesiredCapabilities DC;

	private String appiumPort = "0.0.0.0";
	private String serverIp = "4723";
	private String platformName = "ANDROID";
	private String platformVersion = "12";
	private String deviceName = "emulator-5554";

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DC = new DesiredCapabilities();

		DC.setCapability("platformName", platformName);
		DC.setCapability("platformVersion", platformVersion);
		DC.setCapability("deviceName", deviceName);
		DC.setCapability("newCommandTimeout", "1200");
		DC.setCapability("automationName", "UiAutomator2");
		DC.setCapability("UDID", "");
		DC.setCapability("appPackage", "com.et");
		DC.setCapability("appActivity", "com.et.MainActivity");
		DC.setCapability("app", "/Users/nileshrajendrabehare/Downloads/expense-tracker.apk");
		DC.setCapability("autoGrantPermissions", true);
		DC.setCapability("unicodeKeyboard", true);
		DC.setCapability("resetKeyboard", true);

		driver = new AndroidDriver(new URL("http://" + appiumPort + ":" + serverIp + "/wd/hub"), DC);

		AppDriver.setDriver(driver);
		System.out.println("Driver Setup");

	}
}
