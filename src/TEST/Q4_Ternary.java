package TEST;
//Write a Java program to find the maximum of two numbers using the ternary operator.

import java.util.Scanner;

public class Q4_Ternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Use ternary operator to find maximum
        int max = (a > b) ? a : b;

        // Print result
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);

        sc.close();
    }
}
