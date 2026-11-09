import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHanding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Amount entha mawa? ");
            int amount = sc.nextInt();

            System.out.print("Entha mandi mawa? ");
            int people = sc.nextInt();

            int share = amount / people;
            System.out.println("Okkokkariki: " + share);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("final");
             sc.close();
        }
    }
}