import java.util.*;

// 1. POJO CLASS - Data mosukelladaniki
class Order {
    private String customerName;
    private String itemName;
    private int price;

    public Order(String customerName, String itemName, int price) {
        this.customerName = customerName;
        this.itemName = itemName;
        this.price = price;
    }
    public String getCustomerName() { return customerName; }
    public String getItemName() { return itemName; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return customerName + " ordered " + itemName + " - Rs." + price;
    }
}

// 2. INHERITANCE + SUPER
class FoodItem {
    String name;
    FoodItem(String name) { this.name = name; }
}
class Biryani extends FoodItem {
    Biryani() {
        super("Chicken Biryani"); // super - Nanna class ni pilicham
    }
}

// 3. ABSTRACT CLASS - Payment Template
abstract class Payment {
    abstract void pay(int amount);
}
class UPI extends Payment {
    void pay(int amount) {
        System.out.println("UPI tho Rs." + amount + " pay chesaru - Success!");
    }
}
class Card extends Payment {
    void pay(int amount) {
        System.out.println("Card tho Rs." + amount + " pay chesaru - Success!");
    }
}

// 4. FINAL CLASS - Evaru marchaleru
final class AppConstants {
    public static final String APP_NAME = "Mawa Foods";
}

// 5. CONCRETE CLASS - Asalu Logic ikkade
class FoodService {
    ArrayList<Order> orders = new ArrayList<>();
    HashMap<String, Integer> menu = new HashMap<>();

    FoodService() {
        menu.put("Biryani", 250);
        menu.put("Pizza", 300);
        menu.put("Burger", 120);
    }

    void showMenu() {
        System.out.println("--- " + AppConstants.APP_NAME + " MENU ---");
        for (String item : menu.keySet()) {
            System.out.println(item + " - Rs." + menu.get(item));
        }
    }

    void placeOrder(String customer, String item) {
        try {
            int price = menu.get(item); // Item lekapothe error
            Order o = new Order(customer, item, price);
            orders.add(o);
            System.out.println("Order Success: " + o);

            // Payment
            Payment p = new UPI();
            p.pay(price);
        } catch (Exception e) {
            System.out.println("Mawa, '" + item + "' menu lo ledu! Malli try chey!");
        }
    }
}

// 6. MAIN CLASS
public class FoodApplication
{
    public static void main(String[] args) {
        FoodService service = new FoodService();
        service.showMenu();
        System.out.println("--------------");

        service.placeOrder("Gopi", "Biryani");
        service.placeOrder("Komali", "Pizza");
        service.placeOrder("Gopi", "Dosa"); // Idi ledu, Exception vasthadi kani app aagadu

        System.out.println("-------------- Total Orders: " + service.orders.size());
    }
}