package TEST;

public class Q12_BreakExample {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Stop the loop when i becomes 5
                break;
            }
            System.out.println(i);
        }
    }
}
