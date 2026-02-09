package ex_22_ENUM;

public class Lab_177_ENUM_P2 {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today){
            case MONDAY -> System.out.println("Monday");
            case FRIDAY -> System.out.println("FRIDAY");
        }
        System.out.println(API.valueOf("google"));
    }
}
