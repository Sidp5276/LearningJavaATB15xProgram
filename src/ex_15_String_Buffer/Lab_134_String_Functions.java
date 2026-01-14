package ex_15_String_Buffer;

public class Lab_134_String_Functions {
    public static void main(String[] args) {


        String name = "Siddh";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Patel"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Siddh"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("siddh"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "sir";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("s"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SIDDH".toLowerCase());

        // 12. toUpperCase()
        System.out.println("siddh".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("h"));

        // 16. trim()
        String name3 = "    Siddh patel     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Siddh"));


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Siddh");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

    }
}
