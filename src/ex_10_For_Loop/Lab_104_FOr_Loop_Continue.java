package ex_10_For_Loop;

    import java.util.Scanner;

    public class Lab_104_FOr_Loop_Continue {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a no.");
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                if (i == 5) {
                    continue;
                }
                System.out.println(i);

            }
        }
}
