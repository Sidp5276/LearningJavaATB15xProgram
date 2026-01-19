package ex_16_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_150_Array_highNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
