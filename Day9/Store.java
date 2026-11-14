import java.io.FileWriter;
import java.util.ArrayList;

public class Store {
    ArrayList<Products> store=new ArrayList<>();
    void addProduct(Products p)
    {
        store.add(p);
        System.out.println("iteam added "+ p.getIteam());
    }
    void viewAllProducts()
    {
        System.out.println("All products mawa!");
        for(Products p: store)
        {
            p.showProducts();
        }

    }
    void saveFile()
    {
        try{
            java.io.FileWriter file= new FileWriter("Product.txt");
            for(Products p: store)
            {
                file.write(p.getIteam() +","+ p.getPrice() +","+ p.getStock() +"\n");
            }
            file.close();
            System.out.println("Save tp products.txt");
        }
        catch(Exception e)
        {
            System.out.println("Error Mawa: "+ e.getMessage());

        }
        

    }
    
}
