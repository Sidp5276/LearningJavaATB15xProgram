package ex_00_java_Programs;
//Check if a number is divided by 5.

import java.util.Scanner;

 public class Lab004_Numbercheck{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            int remainder = n % 5;
            if (remainder == 0) {
                System.out.println(n + " is divisible by 5");
            } else  {
                System.out.println(n + " is not divisible by 5");
                System.out.print("remainder is : " + remainder);
            }
            scanner.close();
        }
    }
