package expense_tracker_test;

import java.io.IOException;

import org.testng.annotations.Test;

import expense_tracker_pages.User_Credential;

public class User_Credential_Test extends SignUp_Test {
	@Test(priority = 1)
	public void User_Credential() throws InterruptedException, IOException {

		User_Credential UC = new User_Credential();
		UC.EnterDetails();

	}
}
