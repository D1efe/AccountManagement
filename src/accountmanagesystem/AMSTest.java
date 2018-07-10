package accountmanagesystem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AMSTest {

	private static Service services;
	private static Account dansAccount, NaomiAccount, SyedsAccount;

	@BeforeClass
	public static void setUp() {

		services = new Service();

		services.addUsers("Daniel", "Osagie", "12345");
		services.addUsers("Naomi", "Stanley", "23456");
		services.addUsers("Syed", "Ahmed", "34567");

	}

	@Before
	public void creatingAccountSetup() {

		dansAccount = new Account("Daniel", "Osagie", "123456");
		NaomiAccount = new Account("Naomi", "Stanley", "234567");
		SyedsAccount = new Account("Syed", "Ahmed", " 345678");

	}

	@Test
	public void createAccountTest() {

		assertEquals("Daniel", dansAccount.getFirstName());
		assertEquals("Naomi", NaomiAccount.getFirstName());
		assertEquals("Syed", SyedsAccount.getFirstName());

	}

	@Test
	public void getUsersTest() {

		assertEquals("Daniel", services.listUserAccount(services.getUserAccount("12345")));
		assertEquals("Naomi", services.listUserAccount(services.getUserAccount("23456")));
		assertEquals("Syed", services.listUserAccount(services.getUserAccount("34567")));

	}

	@Test
	public void jsonStuff() {

		services.jsonAllUsers();

	}

	@Test
	public void xmlStuff() {

		services.jsonAllXML();

	}

	public void bannerAccountTest() {
		
		services.addUsers("John", "Gourdon", "123456");
		
		assertEquals(true, services.bannedAccounts(123456));

	}
}
