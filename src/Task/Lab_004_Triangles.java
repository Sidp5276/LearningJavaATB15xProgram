package Task;
import java.util.Scanner;
public class Lab_004_Triangles{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side 1:");
        int side1 = scanner.nextInt();
        System.out.println("Enter Side 2:");
        int side2 = scanner.nextInt();
        System.out.println("Enter Side 3:");
        int side3 = scanner.nextInt();
        // Triangle validity check
        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1) {
            System.out.println("Not a valid Triangle");
        }
        else if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
        scanner.close();
    }
}


