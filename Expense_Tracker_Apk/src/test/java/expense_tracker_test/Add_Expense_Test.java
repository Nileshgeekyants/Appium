package expense_tracker_test;

import java.io.IOException;

import org.testng.annotations.Test;
import expense_tracker_pages.Add_Expense;

public class Add_Expense_Test extends SignUp_Test {
	@Test
	public void Add_Expense() throws InterruptedException, IOException {

		Add_Expense AE = new Add_Expense();
		AE.Expenses();

	}
}
