class Bank {
    int balance = 1000;
    synchronized void withdraw(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " - Balance undhi, teesthunnam...");
            try{ Thread.sleep(100); } catch(Exception e){} // ATM slow anuko
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " - Remaining: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Balance ledu!");
        }
    }
}

public class Race{
    public static void main(String[] args) throws Exception
    {
        Bank bank = new Bank();
        Thread t1 = new Thread(() -> bank.withdraw(800), "Gopi-ATM1");
        Thread t2 = new Thread(() -> bank.withdraw(800), "Gopi-ATM2");
        t1.start();
        t2.start();

    }
}
