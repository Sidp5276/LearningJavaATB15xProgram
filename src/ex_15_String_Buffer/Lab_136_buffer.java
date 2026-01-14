package ex_15_String_Buffer;

public class Lab_136_buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Siddharth");
        stringBuffer.append("Patel");
        System.out.println(stringBuffer);

        String s1 = "Siddharth";
        s1 = s1+ "Patel";
        System.out.println(s1);
    }
}
