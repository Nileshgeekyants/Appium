package expense_tracker_test;

import java.io.IOException;

import org.testng.annotations.Test;

import expense_tracker_core.BaseSetup;
import expense_tracker_pages.SignUp_Functionality;
import expense_tracker_pages.User_Credential;

public class SignUp_Test extends BaseSetup {

	@Test
	public void SignUp_Functionality() throws InterruptedException, IOException {

		SignUp_Functionality SF = new SignUp_Functionality();
		SF.SignUp();

	}

	
}
