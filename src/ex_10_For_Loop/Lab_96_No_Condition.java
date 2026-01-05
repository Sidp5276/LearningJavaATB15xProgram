package ex_10_For_Loop;

//code runs infinite

public class Lab_96_No_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
            // exit code 130 , (Stop by Yourself- Kill) Red Button - interrupted by signal
        }
        // exit code 0 - Successful
    }
}
