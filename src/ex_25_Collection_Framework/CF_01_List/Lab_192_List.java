package ex_25_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_192_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","guava","mango","watermelon");
        System.out.println(fruits);

//        List mylist = new List();
        List arrayList = new ArrayList();
        arrayList.add("Pramod");
        arrayList.add(123);
        arrayList.add(true);
    }
}
