package ex_25_Collection_Framework.CF_01_List;
import java.util.*;
public class Lab_208_Interview {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Somya";
        p1.age = 30;

        // Anonymous concept.
        A a = new A(){
            @Override
            public void display() {

            }
        };

        a.display();

    }





}

interface A{
    void display();
}


class Person1{
    String name;
    int age;
}

class Neha implements MySqlConnection{

    @Override
    public void init() {
        // on the file testdata.excel using g

    }

    @Override
    public void display() {

    }
}



abstract class readFromExcel{
    abstract void init();

    void displayExcel(){
        System.out.println("Hi I am getting displayed!");
    }

}

interface MySqlConnection{
    void init();
    void display();

    default void complete1(){
        System.out.println("Df");
    }
    static void complete2(){
        System.out.println("Df");

    }
}
