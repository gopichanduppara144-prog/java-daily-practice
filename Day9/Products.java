class Products
{
    private String iteam;
    private int price;
    private int stock;

    public Products(String iteam, int price, int stock)
    {
        this.iteam=iteam;
        this.price=price;
        this.stock=stock;
    }

    public String getIteam()
    {
        return iteam;
    }
    public int getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }
    public void setIteam(String iteam)
    {
        this.iteam=iteam;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    public void showProducts()
    {
        System.out.println("iteam "+ iteam +" Price "+price+" stock "+ stock);
    }
}