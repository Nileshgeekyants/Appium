package expense_tracker_test;

import java.io.IOException;

import org.testng.annotations.Test;
import expense_tracker_pages.Login_Functionality;
import expense_tracker_core.BaseSetup;
import io.appium.java_client.android.AndroidDriver;

public class Login_Test extends BaseSetup {
	AndroidDriver driver;

	@Test
	public void Login_Functionality() throws InterruptedException, IOException {

		Login_Functionality LF = new Login_Functionality();
		LF.LoginIn();

	}

}
