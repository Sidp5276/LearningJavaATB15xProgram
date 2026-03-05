package ex_25_Collection_Framework.CF_04_MAP;
import java.util.*;
public class Lab_218_MapP4 {
    public static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap<>();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("JP", "Japan");

        System.out.println(countries);
    }
}
