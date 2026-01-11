package TEST;
//Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
import java.util.Scanner;

public class Q1_Arithmetic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();
        System.out.println("Enter the second integer");
        int b = sc.nextInt();

    int sum = a + b;
    int difference = a - b;
    int multiplication = a * b;

        System.out.println("sum: "  + sum );
        System.out.println("difference:"  + difference);
        System.out.println("multiplication:"  + multiplication);

    if ( b != 0) {
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("quotient:"  + quotient);
        System.out.println("remainder:"  + remainder);
    }
        else
        {
        System.out.println("quotient and remainder can't be divided by zero");
    }
        sc.close();
    }
}
