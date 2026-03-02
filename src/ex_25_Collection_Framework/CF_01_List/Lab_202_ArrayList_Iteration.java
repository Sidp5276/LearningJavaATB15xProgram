package ex_25_Collection_Framework.CF_01_List;
import java.util.*;
public class Lab_202_ArrayList_Iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        List<String> mylist2 = new ArrayList<>();


        mylist.add("sid");
        mylist.add("patel");
        mylist.add("shiva");

        System.out.println(" - To Print Arraylist - 1 ");

        for(String name:mylist){
            System.out.println(name);
        }

        System.out.println(" - To Print Arraylist - 2 ");

        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist2.get(i));
        }

        System.out.println(" - To Print Arraylist - 3 ");

        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
