package Day3;
import java.util.Scanner;

public class Day3if {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("A grade");
        }
        else if(marks>=80)
        {
            System.out.println("B grade");
        }
        else if(marks>=70)
        {
            System.out.println("C grade");
        }
        else if(marks>=60)
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
