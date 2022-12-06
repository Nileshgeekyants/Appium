package expense_tracker_pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import expense_tracker_core.AppDriver;

public class Transaction_Page {
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'transaction')]")
	private WebElement Transaction;
	@FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button/android.view.ViewGroup")
	private WebElement Filter;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Today')]")
	private WebElement Day;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Food')]")
	private WebElement TopCategories;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Gpay')]")
	private WebElement Account;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Show Results')]")
	private WebElement Results;
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Clear all')]")
	private WebElement RemoveAll;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[13]")
	private WebElement apply;

	public Transaction_Page() {

		PageFactory.initElements(AppDriver.getDriver(), this);
	}

	public void Transaction() throws IOException, InterruptedException {

		Thread.sleep(5000);
		Transaction.click();
		Thread.sleep(5000);
		Filter.click();
		Thread.sleep(5000);
		Day.click();
		TopCategories.click();
		Account.click();
		Results.click();
		Thread.sleep(5000);
		Filter.click();
		Thread.sleep(5000);
		RemoveAll.click();
		Thread.sleep(5000);
		apply.click();
		Thread.sleep(5000);
		Results.click();
	}

}