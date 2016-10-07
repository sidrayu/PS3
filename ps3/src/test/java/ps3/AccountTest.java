package ps3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AccountTest {
	static Account testAccount;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testAccount= new Account(1122,20000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testAccount= null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		testAccount.setAnnualInterestRate(0.045);
		
		try{
			testAccount.withdraw(2500);
		} catch(InsufficientFundsException e){
			System.out.println("You cannot withdraw.Your balance is below"+e.getAmount());
		}
		
		testAccount.deposit(3000);
		System.out.println("Your balance is:"+testAccount.getBalance()+
				" The monthly interest is"+testAccount.getMonthlyInterestRate()+
				" The date that the account was created was:"+
				testAccount.getDateCreated());
	}

}