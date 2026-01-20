package ex_16_Arrays;

public class Lab_157_Array_2ndHighest {
    public static void main(String[] args) {

        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highest = 0;
        int secondHighest = 0;
        // 67
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }

        }
        System.out.println(secondHighest);

    }
}
