package expense_tracker_pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import expense_tracker_core.AppDriver;
import io.appium.java_client.android.AndroidDriver;

public class Add_Expense {
	AndroidDriver driver;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'addExpense')]")
	private WebElement AddExpense;
	@FindBy(xpath = "//android.widget.EditText[contains(@text,'Add amount')]")
	private WebElement Amount;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Category')]")
	private WebElement Category;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Food')]")
	private WebElement Food;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'From')]")
	private WebElement From;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Cash')]")
	private WebElement Cash;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'To')]")
	private WebElement To;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Electricity')]")
	private WebElement Electricity;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Button")
	private WebElement Save;
	

	public Add_Expense() {

		PageFactory.initElements(AppDriver.getDriver(), this);
	}

	public void Expenses() throws IOException, InterruptedException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "//Config.properties");
		obj.load(objfile);
		Thread.sleep(5000);
		AddExpense.click();
		Thread.sleep(5000);
		Amount.click();
		Amount.sendKeys(obj.getProperty("AddAmount"));
		Thread.sleep(5000);
		Category.click();
		Thread.sleep(5000);
		Food.click();
		Thread.sleep(5000);
		From.click();
		Thread.sleep(5000);
		Cash.click();
		Thread.sleep(5000);
		To.click();
		Thread.sleep(5000);
		Electricity.click();
		Thread.sleep(5000);
		Save.click();
		
	}
}
