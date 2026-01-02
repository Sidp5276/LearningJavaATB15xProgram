// Number divisible by 3 and 5
package ex_00_java_Programs;

import java.util.Scanner;

public class Lab_10_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if divisible by both 3 and 5
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by both 3 and 5");
        } else {
            System.out.println(n + " is NOT divisible by both 3 and 5");
        }

        // Check if divisible by 3 or 5 (either one)
        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println(n + " is divisible by 3 or 5");
        } else {
            System.out.println(n + " is NOT divisible by 3 or 5");
        }

        sc.close();
    }
}
