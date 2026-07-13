package sprint2prep.exercise2_1_encapsulation;

/**
 * Represent a bank account with a private balance.
 * The balance can only be changed through controlled methods.
 */
public class BankAccount {
    private double balance;

    /**
     * Adds money to the account if the amount is greater than 0.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be greater than 0.");
            return;
        }

        balance = balance + amount;
    }

    /**
     * Withdraws money from the account if the amount is valid
     * and the account has enough balance.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0.");
        }

        if (amount > balance) {
            System.out.println("Not enough balance.");
            return;
        }

        balance = balance - amount;
    }

    /**
     * Gets the current account balance.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}
