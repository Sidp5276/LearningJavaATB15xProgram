package ex_00_java_Programs;

import java.util.Scanner;

public class Lab_006_DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean divisible = isDivisibleByFive(number);
        System.out.println(number + (divisible ? " is" : " is not") + " divisible by 5");

        sc.close();
    }

    private static boolean isDivisibleByFive(int n) {
        return n % 5 == 0;
    }
}
