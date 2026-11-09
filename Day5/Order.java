public class Order {
    private int orderId;
    private String foodName;
    private double price;

    public Order(int orderId, String foodName, double price)
    {
        this.orderId = orderId;
        this.foodName = foodName;
        this.price = price;
    }

    // Getter - Data chudataniki
    public int getOrderId() {
        return orderId;
    }
    // Setter - Data pettataniki
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getFoodName()
    {
        return foodName;
    }
    public void setFoodName(String foodName)
    {
        this.foodName=foodName;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
        
    }

        public static void main(String[] args)
    {
        Order order1=new Order(1121, "Bhiryani", 1200);
        
        Order order2=new Order(1122, "pizza", 499);
    
        System.out.println("Order 1:"+order1.orderId+"-"+ order1.foodName+"-"+order1.price);
        System.out.println("Order 1:"+order2.orderId+"-"+order2.foodName+"-"+order2.price);
    }
}
