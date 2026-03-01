package ex_25_Collection_Framework.CF_01_List;
import java.util.*;
public class Lab_197_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("bread"); // 0
        list.add("milk");  // 1
        list.add("butter"); // 2
        list.add("paneer");  //3
        list.add("jam");  //4
        list.add("cheeze");  //5
        list.add(123);  //6
        list.add(true);  //7

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
