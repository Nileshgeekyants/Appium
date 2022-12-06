package expense_tracker_test;

import java.io.IOException; 
import org.testng.annotations.Test;

import expense_tracker_pages.Profile_Page;
import io.appium.java_client.android.AndroidDriver;

public class ProfilePage_Test extends SignUp_Test {
	
	
	@Test(priority=1)
	public void Profile_Page(AndroidDriver driver) throws InterruptedException, IOException {

		Profile_Page PP = new Profile_Page();
		PP.Profile(driver);
	}

	
}
