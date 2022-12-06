package expense_tracker_pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import expense_tracker_core.AppDriver;

public class User_Credential {
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'First Name')]")
	private WebElement FirstName;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Last Name')]")
	private WebElement LastName;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Continue')]")
	private WebElement ContinueButton;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Enter email')]")
	private WebElement Email;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Continue')]")
	private WebElement clickonContinue;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
	private WebElement TermsConditons;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
	private WebElement Privacypolicy;

	public User_Credential() {

		PageFactory.initElements(AppDriver.getDriver(), this);
	}

	public void EnterDetails() throws IOException, InterruptedException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "//Config.properties");
		obj.load(objfile);
		Thread.sleep(5000);
		FirstName.click();
		FirstName.sendKeys(obj.getProperty("Firstname"));
		Thread.sleep(5000);
		LastName.click();
		LastName.sendKeys(obj.getProperty("Lastname"));
		Thread.sleep(5000);
		ContinueButton.click();
		Thread.sleep(5000);
		Email.click();
		Email.sendKeys(obj.getProperty("EmailId"));
		Thread.sleep(5000);
		ContinueButton.click();
		Thread.sleep(5000);
		TermsConditons.click();
		Thread.sleep(5000);
		Privacypolicy.click();
		Thread.sleep(5000);
	}
}
