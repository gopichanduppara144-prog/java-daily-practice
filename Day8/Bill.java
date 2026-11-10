class Bill
{
    void makeBill(String iteam, int price)
    {
        System.out.println("Total"+ iteam + "=" + price);
    }

    void makeBill(String iteam1, int price1, String iteam2, int price2, String iteam3, int price3)
    {
        int total=price1+price2+price3;

        System.out.println("Total:"+ total +"Discount 10%:"+(total-total/10));
    }
}
