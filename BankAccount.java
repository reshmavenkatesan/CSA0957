public class BankAccount {
    private String name;
    private int accNo;
    private String accType;
    private double balance;
    private final double MIN_BALANCE = 500.0;
        public BankAccount(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        if (balance >= MIN_BALANCE) {
            this.balance = balance;
        } else {
            this.balance = MIN_BALANCE;
            System.out.println("Initial balance is less than the minimum balance. Setting balance to minimum balance of Rs. " + MIN_BALANCE);
        }
    }
    public void displayAccountDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: Rs. " + balance);
    }

        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
            System.out.println("New Balance: Rs. " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MIN_BALANCE) {
                balance -= amount;
                System.out.println("Withdrew: Rs. " + amount);
                System.out.println("New Balance: Rs. " + balance);
            } else {
                System.out.println("Insufficient funds. Minimum balance of Rs. " + MIN_BALANCE + " must be maintained.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

        public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 123456, "Savings", 1000.0);
        account.displayAccountDetails();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);     }
}
