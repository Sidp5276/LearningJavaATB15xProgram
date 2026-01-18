package TEST_18_JAN;

import java.util.Scanner;

    import java.util.Scanner;
    public class Q1_CountString {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String s = sc.nextLine();
            int c = 0;
            for ( char ch: s.toCharArray()) c++;
            System.out.println("Length is:" + c);
        }
    }
