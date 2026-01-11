package TEST;
//Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
import java.util.Scanner;

public class Q6_SwitchProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number (1–7): ");
        int day = sc.nextInt();

        // Switch statement to determine the day
        switch (day) {
           case 1:
                System.out.println("Monday");
                break;
           case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}
