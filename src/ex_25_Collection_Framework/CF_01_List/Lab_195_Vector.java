package ex_25_Collection_Framework.CF_01_List;
import java.util.ArrayList;
import java.util.Vector;
public class Lab_195_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));

        ArrayList a  = new ArrayList();
        a.add("prrammod");
        a.add("dutta");


    }
}
