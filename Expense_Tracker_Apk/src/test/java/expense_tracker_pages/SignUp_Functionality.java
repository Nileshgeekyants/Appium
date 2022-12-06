package expense_tracker_pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import expense_tracker_core.AppDriver;
import io.appium.java_client.android.AndroidDriver;

public class SignUp_Functionality {
	AndroidDriver driver;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Country code')]")
	private WebElement Countrycode;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'(+91) IN')]")
	private WebElement Indiacode;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Enter Mobile Number')]")
	private WebElement MobileNumber;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement Checkbox;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
	private WebElement OTPButton;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Verify')]")
	private WebElement VerifyButton;

	public SignUp_Functionality() {

		PageFactory.initElements(AppDriver.getDriver(), this);
	}

	public void SignUp() throws IOException, InterruptedException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "//Config.properties");
		obj.load(objfile);
		Thread.sleep(5000);
		Countrycode.click();
		Thread.sleep(5000);
		Indiacode.click();
		Thread.sleep(5000);
		MobileNumber.click();
		MobileNumber.sendKeys(obj.getProperty("MobileNumber"));
		Thread.sleep(5000);
		Checkbox.click();
		Thread.sleep(5000);
		OTPButton.click();
		Thread.sleep(25000);
		VerifyButton.click();

	}

}
