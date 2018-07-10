package accountmanagesystem;

import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONObject;
import org.json.XML;

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

	private HashMap<String, Account> getAllUserAccounts() {
		return allUserAccounts;
	}

	public void jsonAllUsers() {
		JSONObject json = new JSONObject(getAllUserAccounts());
		System.out.println(json);
	}

	public void jsonAllXML() {
		System.out.println(XML.toString(getAllUserAccounts()));
	}

	public boolean bannedAccounts(int x) {

		String number = Integer.toString(x);

		if (allUserAccounts.containsKey(allUserAccounts.get(number))) {
			System.err.println("this user has been banned");
			return true;
		} else
			return false;

	}


}
