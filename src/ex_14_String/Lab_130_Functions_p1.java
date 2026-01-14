package ex_14_String;

public class Lab_130_Functions_p1 {
    public static void main(String[] args) {
//        String s1="HELLO";
//        String s2= new String("world");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
