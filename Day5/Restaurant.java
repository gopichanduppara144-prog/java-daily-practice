abstract class Food{
    String restaurantName = "AABB";
    
    // Price ni private chesam! Bayata nunchi evaru direct ga marchal eru!
    private int price = 250;

    // Price chudali ante ee door nunchi chudali!
    public int getPrice() {
        return price;
    }

    // Price marchali ante ee door nunchi marchali!
    public void setPrice(int newPrice) {
        if(newPrice > 0) { // Negative price pettakunda check!
            price = newPrice;
        } else {
            System.out.println("Price negative undadu mawa!");
        }
    }

    abstract void cook();
    void Serve() {
        System.out.println("Food is served........!");
    }
    
}
class Bhiryani extends Food
{
    String foodName="Bhiryani";

    @Override 
    void cook()
    {
        System.out.println("Biryani is served with Raita!");
    }
    @Override 
    void Serve() 
    {
        System.out.println("Biryani is served with Raita!");
    }
   
}
class Pizza extends Food
{
    String topping="Cheese";
    @Override 
    void cook()
    {
        System.out.println("Pizza is served with Cheese Burst!");
    }

    @Override 
    void Serve() 
    {
        System.out.println("Pizza is served with Cheese Burst!");
    }
   
}

public class Restaurant
{
    public static void main(String[] args)
    {
        Bhiryani b = new Bhiryani();
        System.out.println(b.getPrice()); // 250 vasthadi
        b.setPrice(300);
        System.out.println(b.getPrice()); // 300 vasthadi
        b.setPrice(-50); // Error message vasthadi!
        Pizza pizza=new Pizza();
    
    }
}
