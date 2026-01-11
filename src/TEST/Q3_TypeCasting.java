package TEST;
//Write a Java program to convert a double value into an int using explicit type casting and print both values.

import java.util.Scanner;

public class Q3_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        // Explicit type casting
        int i = (int) d;

        // Print both values
        System.out.println("Double value: " + d);
        System.out.println("Integer value after casting: " + i);

        sc.close();
    }
}
