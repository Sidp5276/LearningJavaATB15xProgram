package ex_25_Collection_Framework.CF_01_List;
import java.util.*;
public class Lab_207_Interview {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());

        for (Integer o:al){
            System.out.println(o);
        }

        Vector v = new Vector<>();
        v.add("sid");
        v.add("patel");
        v.add("shiva");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
