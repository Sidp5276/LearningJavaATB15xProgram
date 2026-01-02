package ex_00_java_Programs;

import java.util.Scanner;

public class Lab_007_EvenSum {
    public static void main(String[] args) {
        Scanner sid = new Scanner(System.in);
        int a = sid.nextInt();

        int Evensum = 0;
        int oddsum = 0;
        while (a != 0) {
            int remainder = (a % 10);
            if (remainder % 2 == 0) {
                Evensum = Evensum + remainder;
            } else {
                oddsum = oddsum + remainder;
            }
            a = a / 10;
        }
        System.out.println("sum of even number is " + Evensum);
        System.out.println("sum of odd number is " + oddsum);
        sid.close();
    }
}
