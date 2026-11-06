class add
{
    void sum(int a, int b)
    {
        System.out.println("Sum of 2 numbers: " + (a+b));

    }
    void sum(int a, int b, int c)
    {
        System.out.println("Sum of 3 numbers: " + (a+b+c));
    }
}
class add1 extends add
{
    void sum(int a, int b)
    {
        System.out.println("Sum of 2 numbers: " + (a+b));

    }
}
public class OopsPolymorphism 
{
    public static void main(String args[])
    {
        add a1 = new add();
        a1.sum(5, 10);
        a1.sum(5, 10, 15);
        add a2 = new add1();
        a2.sum(5, 10);
    }
}
