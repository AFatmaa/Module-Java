/**
 * Provides banking operations by using the public methods of BankAccount.
 */
public class BankService {
    /**
     * Request a withdrawal from a bank account.
     *
     * @param account the account to withdraw from
     * @param amount  the amount to withdraw
     */
    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    /**
     * Request a deposit into a bank account.
     *
     * @param account the account to deposit into
     * @param amount  the amount to deposit
     */
    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }
}
