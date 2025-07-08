class BankAccount {
    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accNum, String name, double bal) {
        this.accountNumber = accNum;
        this.holderName = name;
        this.balance = bal;
    }

    public void displayDeposit(double amount) {
        System.out.println("Account : " + accountNumber);
        System.out.println("Name    : " + holderName);
        System.out.println("Balance : ₹" + balance);
    }

    public void displayWithdraw(double amount) {
        System.out.println("Account : " + accountNumber);
        System.out.println("Name    : " + holderName);
        System.out.println("Balance : ₹" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(101, "Tanu", 100.0);
        BankAccount bank2 = new BankAccount(102, "Tinu", 200.0);
        BankAccount bank3 = new BankAccount(103, "Aruu", 300.0);

        bank1.displayDeposit();
        bank2.displayWithdraw();
        bank3.displayDeposit();

		bank1.showBalance();
        bank2.showBalance();
        bank3.showBalance();
    }
}

