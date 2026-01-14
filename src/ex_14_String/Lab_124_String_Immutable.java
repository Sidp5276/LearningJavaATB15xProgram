package ex_14_String;

public class Lab_124_String_Immutable {
    public static void main(String[] args) {
        String name = "Abcdef";
        boolean result = name.contains("m");
        System.out.println(result);

        // String are immutable are in nature.
        name.toUpperCase();
        System.out.println(name);
    }
}
