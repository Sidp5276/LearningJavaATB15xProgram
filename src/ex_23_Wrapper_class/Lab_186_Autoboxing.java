package ex_23_Wrapper_class;

public class Lab_186_Autoboxing {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a;
        System.out.println(b); //  b has not attribute, methods -1
        // Boxing - Primitive data type is converted wrapper - Automatic JVM will do it

        Integer aa = 43;
        int a1 = aa; // UnBoxing
        System.out.println(a1); //  aa lost the attribute and behaviour

        int i = Integer.parseInt("123");
    }
}
