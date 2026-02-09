package ex_22_ENUM;

public class Lab_176_Enum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal()); // (zero-indexed position)
    }
}
