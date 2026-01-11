package TEST;

    public class Q13_Continue{
        public static void main(String[] args) {
            // Loop from 1 to 10
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    // Skip printing when i is 5
                    continue;
                }
                System.out.println(i);
            }
        }
    }
