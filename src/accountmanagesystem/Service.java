package accountmanagesystem;

import java.util.HashMap;

public class Service {

	private HashMap<String, Account> allUserAccounts;

	public Service() {

		allUserAccounts = new HashMap<>();

	}

	public void addUsers(String x, String y, String z) {

		Account user = new Account(x, y, z);

		allUserAccounts.put(user.getAccountNumber(), user);

	}

	public Account getUserAccount(String x) {

		return allUserAccounts.get(x);

	}

	public String listUserAccount(Account x) {

		return x.getFirstName();

	}
	public HashMap<String, Account> getAllUserAccounts() {
		return allUserAccounts;
	}

}
