package TEST_18_JAN;

import java.util.Scanner;

    public class Q3_Uppercase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String l = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char ch :l.toCharArray()) {
                if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
                else sb.append(ch);
            }
            System.out.println(sb.toString());
        }
    }