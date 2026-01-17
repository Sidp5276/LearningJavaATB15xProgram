package Task;

public class Lab07_2ndhighest {
        public static void main(String[] args) {
            int[] arr = {12, 34, 10, 1, 100, 3, 4, 32};

            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > highest) {
                    // update both
                    secondHighest = highest;
                    highest = num;
                } else if (num > secondHighest && num != highest) {
                    // update only second highest
                    secondHighest = num;
                }
            }

            if (secondHighest == Integer.MIN_VALUE) {
                System.out.println("No second highest element");
            } else {
                System.out.println("Second highest number is: " + secondHighest);
            }
        }
    }