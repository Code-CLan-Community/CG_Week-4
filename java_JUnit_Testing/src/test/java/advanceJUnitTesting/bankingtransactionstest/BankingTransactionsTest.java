package advanceJUnitTesting.bankingtransactionstest;




import static org.junit.Assert.*;

import advanceJUnitProblems.bankingtransactions.BankingTransactions;
import org.junit.Before;
import org.junit.Test;

public class BankingTransactionsTest {

    private BankingTransactions account;

    @Before
    public void setUp() {

        account = new BankingTransactions();
    }

    @Test
    public void testDepositIncreasesBalance() {
        account.deposit(1000);
        assertEquals(1000, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawDecreasesBalance() {
        account.deposit(1000);
        boolean result = account.withdraw(500);
        assertTrue(result);  // Withdrawal should be successful
        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawFailsWhenInsufficientFunds() {
        account.deposit(500);
        boolean result = account.withdraw(600);
        assertFalse(result);  // Withdrawal fail (insufficient funds)
        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testDepositWithNegativeAmountDoesNotChangeBalance() {
        double initialBalance = account.getBalance();
        account.deposit(-500);  //(negative amount)
        assertEquals(initialBalance, account.getBalance(), 0.01);  // Balance should remain unchanged
    }
}
