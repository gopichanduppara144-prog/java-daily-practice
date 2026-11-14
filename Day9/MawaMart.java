import java.util.HashMap;
import java.util.HashSet;

public class MawaMart {
    public static void main(String[] args)
    {
        Store s=new Store();
        s.addProduct(new Products("Rice", 2000, 10));
        s.addProduct(new Products("Oil", 170, 15));
        s.addProduct(new Products("Onion", 60, 20));

        s.viewAllProducts();

        java.util.HashMap<String, Integer> priceList = new HashMap<>();
        priceList.put("Rice",2000);
        priceList.put("oil",150);
        System.out.println(priceList.get("oil"));
        
        java.util.HashSet<String> customerName=new HashSet<>();
        customerName.add("Komali");
        customerName.add("Komali");
        customerName.add("Gopi");

        System.out.println(customerName);

        s.saveFile();
    }
    
}
