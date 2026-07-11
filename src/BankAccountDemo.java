public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankService service = new BankService();

        service.deposit(account, 100);

        System.out.println("Balance after deposit: " + account.getBalance());

        service.withdraw(account, 150);

        System.out.println("Balance after trying to withdraw 150: " + account.getBalance());

        service.withdraw(account, 40);

        System.out.println("Balance after withdrawing 40: " + account.getBalance());

        service.deposit(account, -20);

        System.out.println("Final balance: " + account.getBalance());
    }
}
