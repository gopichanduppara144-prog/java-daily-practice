package Day3;
import java.util.Scanner;

public class Day3loop {
    public static void main(String[] args)
    {
        /* 
        int[] array={1,2,3,4,5};
        for(int arrayElements:array)
        {
            if(arrayElements %2==0)
            {
                System.out.println(arrayElements+" is even number");
            }
            else
            {
                System.out.println(arrayElements+" is odd number");
            }
            
        }
        */

        /* table program using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("enter table");
        int table=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+table+"="+(i*table));
        }
         */

        /* table program using while loop   
        Scanner sc=new Scanner(System.in);
        System.out.println("enter table");
        int table=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(i+"*"+table+"="+(i*table));
            i++;
        }
         */

        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter what day it is");
        int day=sc.nextInt();
        
        switch (day)
        {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        */
       /* pattern program using for loop

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");         
            }
            System.out.println();
        }
        */
       for(int i=1;i<=5;i++)
       {
        for(int j=5;j>=i;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
