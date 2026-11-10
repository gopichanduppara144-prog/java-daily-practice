public class MawaMart {
    public static void main(String[] args)
    {
        Product product=new Product("Rice", 2000, 10);
        product.showProduct();
        product.setPrice(-100);
        product.showProduct();

        Bill bill=new Bill();
        bill.makeBill("Rice", 2000);
        bill.makeBill("Rice", 2000, "oil",150, "Onion", 70);

        Payment cashPayment=new CashPayment();
        cashPayment.pay(500);
        Payment upiPayment=new UpiPayment();
        upiPayment.pay(600);

    }
}
