public interface Payment {

    void pay(int amount);
}
class CashPayment implements Payment
{
    public void pay(int amount)
    {
        System.out.println("Paid amount through cash:"+amount);
    }
}
class UpiPayment implements  Payment
{
    public void pay(int amount)
    {
        System.out.println("Paid amount through upi:"+amount);
    }
}