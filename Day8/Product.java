class Product
{
    private String name;
    private int price;
    private int stock;

    Product(String name, int price, int stock)
    {
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrice(int price)
    {
        if(price > 0)
        {
            this.price=price;
        }
        else
        {
            System.out.println("Mawa Nagetive account allow cheyam");
        }
    }
    public void  setStock(int stock)
    {
        if(stock > 0)
        {
            this.stock = stock;
        }
        else{
            System.out.println("Nagetive stock not allowed");
        }
    }
    void showProduct()
    {
        System.out.println(name + " | Rs." + price + " | Stock: " + stock);
    }
}

