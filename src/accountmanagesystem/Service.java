package accountmanagesystem;

import java.util.HashMap;
import java.util.Set;

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

	public Account getUserAccount(String userAccNoKey) {

		return allUserAccounts.get(userAccNoKey);

	}

	public String listUserAccount(Account userAcc) {

		return userAcc.getFirstName();

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

	public boolean bannedAccounts(int bannedAccNo) {

		String number = Integer.toString(bannedAccNo);

		if (allUserAccounts.containsKey(allUserAccounts.get(number))) {
			System.err.println("this user has been banned");
			return true;
		} else
			return false;

	}

	public int searchAccounts(String startingLetter) {

		int counter = 0;

		for (String accountNo : allUserAccounts.keySet()) {

			if (allUserAccounts.get(accountNo).getFirstName().startsWith(startingLetter)) {
				counter++;
			}
		}
		return counter;		
		
	}
}
