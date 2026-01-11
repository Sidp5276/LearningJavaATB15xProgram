package TEST;
//Write a Java program to reverse a given number using a do-while loop.
import java.util.Scanner;

public class Q11_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

             System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = 0;
        int temp = number;

        do {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        } while (temp != 0);

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}

