package accountmanagesystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class AMSTest {

	@Test
	public void createAccountTest() {
		
		Account dansAccount = new Account("Daniel", "Osagie", "123456");
		Account NaomiAccount  = new Account("Naomi", "Stanley", "234567");
		Account SyedsAccount = new Account("Syed", "Ahmed", " 345678");
		
		assertEquals("Daniel", dansAccount.getFirstName());
		assertEquals("Naomi", NaomiAccount.getFirstName());
		assertEquals("Syed", SyedsAccount.getFirstName());

		
	}
	
	public void getUsersTest() {
		
		Service services = new Service();
		
		services.addUsers("Daniel", "Osagie", "12345");
		services.addUsers("Naomi", "Stanley", "23456");
		services.addUsers("Syed", "Ahmed", " 345678");
		
		assertEquals("Daniel", services.listUserAccount(services.getUserAccount("12345")));
		assertEquals("Naomi", services.listUserAccount(services.getUserAccount("23456")));
		assertEquals("Syed", services.listUserAccount(services.getUserAccount("34567")));
		
		
	
	}

}
