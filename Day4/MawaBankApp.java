// 1. INTERFACE - Rule: Andaru ee panulu cheyali
interface BankRules {
    void deposit(int amount);
    void withdraw(int amount);
}

// 2. ABSTRACT CLASS - Template
abstract class Account implements BankRules {
    // Encapsulation - private
    private String holderName;
    private final String accountNumber; // final - marchaleru
    protected double balance; // protected - pillalu vadukovachu

    // static - Andari ki okate
    static String bankName = "Mawa Bank";
    static int totalAccounts = 0;

    // Constructor + this
    Account(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Getter - private ni bayataki chupinchadaniki
    public String getHolderName() { return holderName; }
    public String getAccountNumber() { return accountNumber; }

    // Abstract method - Pillalu thappakunda rayali
    abstract void calculateInterest();

    void showDetails() {
        System.out.println(bankName + " | " + holderName + " | " + accountNumber + " | Balance: " + balance);
    }
}

// 3. INHERITANCE + SUPER + POLYMORPHISM
class SavingsAccount extends Account {
    SavingsAccount(String name, String accNo, double bal) {
        super(name, accNo, bal); // super - Parent constructor
    }

    // Polymorphism - Parent method ni marchesam
    @Override
    void calculateInterest() {
        System.out.println("Savings Interest: " + (balance * 0.05));
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposit ayindi!");
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdraw ayindi!");
        } else {
            System.out.println("Balance ledu mawa!");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String name, String accNo, double bal) {
        super(name, accNo, bal);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account ki Interest undadu mawa!");
    }

    @Override
    public void deposit(int amount) { balance += amount; }
    @Override
    public void withdraw(int amount) { balance -= amount; }
}
class FDAccount extends Account
{
    FDAccount(String name,String accoNo, double bal)
    {
        super(name,accoNo,bal);
    }
    @Override 
    void calculateInterest() {
        System.out.println("FDAccount Interest: " + (balance * 0.08));
    }
      @Override
    public void deposit(int amount) { balance += amount; }
    @Override
    public void withdraw(int amount) { balance -= amount; }
}

// 4. MAIN
public class MawaBankApp {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Gopi", "MAWA001", 10000);
        savingsAccount.showDetails();
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(2000);
        savingsAccount.calculateInterest();

        System.out.println("Total Accounts: " + Account.totalAccounts);

        CurrentAccount cAccount = new CurrentAccount("Komali", "MAWA002", 10000);
        cAccount.calculateInterest();

        System.out.println("Total Accounts: " + Account.totalAccounts);

        FDAccount fdAccount = new FDAccount("Komali", "MAWA003", 50000);
        savingsAccount.showDetails();git add Day4/
        fdAccount.calculateInterest();
    }
}