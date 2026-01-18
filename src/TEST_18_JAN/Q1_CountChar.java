package TEST_18_JAN;

import java.util.Scanner;

public class Q1_CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {  // exclude spaces
                count++;
            }
        }
        System.out.println("Total number of characters (excluding spaces): " + count);
        sc.close();
    }
}
