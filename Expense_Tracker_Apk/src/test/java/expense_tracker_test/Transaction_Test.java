package expense_tracker_test;

import java.io.IOException;

import org.testng.annotations.Test;

import expense_tracker_pages.Transaction_Page;

public class Transaction_Test extends SignUp_Test{
	@Test(priority = 1)
	public void Transaction_Page() throws InterruptedException, IOException {

		Transaction_Page TP = new Transaction_Page();
		TP.Transaction();
	}
}
