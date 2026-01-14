package ex_15_String_Buffer;

public class Lab_135_Builder_vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Sid";
        String s1 = new String("Sid");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Sid");
        StringBuilder stringBuilder = new StringBuilder("Sid");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
