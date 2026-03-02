package ex_25_Collection_Framework.CF_01_List;
import java.util.*;
public class Lab_205_Array_To_List {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","C#"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
