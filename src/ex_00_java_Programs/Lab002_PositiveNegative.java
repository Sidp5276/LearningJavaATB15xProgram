package ex_00_java_Programs;
//1. Take a number and print whether it’s positive, negative, or zero.
   import java.util.Scanner;
    public class Lab002_PositiveNegative {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double n = sc.nextDouble();

            if (n > 0) {
                System.out.println("Positive");
            } else if (n < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
