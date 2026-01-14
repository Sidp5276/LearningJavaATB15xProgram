package ex_15_String_Buffer;

public class Lab_138_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse(); // dlroW olleH
        System.out.println(sb);
    }
}
