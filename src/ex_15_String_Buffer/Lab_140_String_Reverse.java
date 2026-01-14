package ex_15_String_Buffer;

import java.util.Scanner;
public class Lab_140_String_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.next();
        //System.out.println("Enter a string: );
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Reversed string is: " + reverse);
    }
}
