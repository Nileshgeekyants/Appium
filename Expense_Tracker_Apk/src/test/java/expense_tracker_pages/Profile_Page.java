package expense_tracker_pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import expense_tracker_core.AppDriver;
import io.appium.java_client.android.AndroidDriver;

public class Profile_Page {
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Hey Nilesh')]")
	private WebElement Profile;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Edit profile')]")
	private WebElement Editprofile;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.View/android.widget.RadioButton[1]/android.view.ViewGroup")
	private WebElement Gender;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Full Name')]")
	private WebElement Name;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'(+91) Phone Number')]")
	private WebElement MobileNum;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Email')]")
	private WebElement Email;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'SAVE')]")
	private WebElement Save;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup")
	private WebElement Back;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Summary')]")
	private WebElement Summary;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Bills')]")
	private WebElement Bill;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup")
	private WebElement Backbutton;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Help ?')]")
	private WebElement Help;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Enter email')]")
	private WebElement EnterEmail;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Add message')]")
	private WebElement message;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'SEND')]")
	private WebElement SendButton;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup")
	private WebElement GoBack;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'FAQ')]")
	private WebElement FAQS;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")
	private WebElement BackAgain;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Rate Us')]")
	private WebElement Rating;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'SUBMIT')]")
	private WebElement submit;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")
	private WebElement backbutton;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'About Us')]")
	private WebElement About;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup")
	private WebElement Backclick;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Log Out')]")
	private WebElement LogOut;

	public Profile_Page() {

		PageFactory.initElements(AppDriver.getDriver(), this);
	}
	
	public void Profile(AndroidDriver driver) throws IOException, InterruptedException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "//Config.properties");
		obj.load(objfile);
		Thread.sleep(5000);
		Profile.click();
		Thread.sleep(5000);
		Editprofile.click();
		Thread.sleep(5000);
		Gender.click();
		Name.click();
		Name.sendKeys(obj.getProperty("Name"));
		MobileNum.click();
		MobileNum.sendKeys(obj.getProperty("MobileNumber"));
		Email.click();
		Email.sendKeys(obj.getProperty("EmailId"));
		Save.click();
		Thread.sleep(5000);
		Back.click();
		Thread.sleep(5000);
		Summary.click();
		Thread.sleep(5000);
		Profile.click();
		Thread.sleep(5000);
		Bill.click();
		Thread.sleep(5000);
		Backbutton.click();
		Thread.sleep(5000);
		Help.click();
		Thread.sleep(5000);
		EnterEmail.click();
		EnterEmail.sendKeys(obj.getProperty("EmailId"));
		message.click();
		message.sendKeys(obj.getProperty("Message"));
		SendButton.click();
		Thread.sleep(5000);
		GoBack.click();
		Thread.sleep(5000);
		FAQS.click();
		Thread.sleep(5000);
		BackAgain.click();
		Thread.sleep(5000);
		Rating.click();
		Thread.sleep(5000);
		submit.click();
		Thread.sleep(5000);
		backbutton.click();
		Thread.sleep(5000);
		About.click();
		Thread.sleep(5000);
		Backclick.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(LogOut);
		Thread.sleep(5000);
		LogOut.click();

	}
}
