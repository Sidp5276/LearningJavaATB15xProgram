package TEST_18_JAN;

import java.util.Scanner;

public class Q4_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a = sc.next(), b = sc.next();
        System.out.println(a.equals(b)? "YES" : "NO");
    }
}
