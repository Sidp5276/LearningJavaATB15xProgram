package TEST_18_JAN;

import java.util.Scanner;

public class Q5_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();
        for(int i=s.length()-1; i>=0;i--)
            System.out.print(s.charAt(i));
    }
}
