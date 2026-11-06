abstract class Animal
{
    void eat()
    {
        System.out.println("Animal eats");
    }
    abstract void sound();

}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

interface Discount
{
    void applyDiscount();
}
abstract class Payment
{
    int amount=500;
    void showAmount()
    {
        System.out.println("Amount: " + amount);
    }
    abstract void payAmount();
}
class UPI extends Payment implements Discount
{
    void payAmount()
    {
        System.out.println("Paying amount using UPI");
    }
    public void applyDiscount()
    {
        System.out.println("Applying discount using UPI");
    }
}


public class OopsAbstraction
{
    public static void main(String args[])
    {
        /*
        Dog d = new Dog();
        d.eat();
        d.sound();
        */
        UPI u = new UPI();
        u.showAmount();
        u.payAmount();
        u.applyDiscount();
    }
    
}
