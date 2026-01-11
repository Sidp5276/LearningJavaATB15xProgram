package TEST;
// Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

import java.util.Scanner;

public class Q5_PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int a = sc.nextInt();

        if (a > 0)
        {
            System.out.println("Number is positive " + a);
        }
        else if ( a < 0 )
        {
            System.out.println("Number is negative: " + a);
        }
        else {
            System.out.println("Number is zero " + a);
        }
        sc.close();
    }
}
