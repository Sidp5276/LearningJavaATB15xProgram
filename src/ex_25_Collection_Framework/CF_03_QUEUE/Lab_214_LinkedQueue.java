package ex_25_Collection_Framework.CF_03_QUEUE;
import java.util.*;
public class Lab_214_LinkedQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        System.out.println(queue.peek());

        System.out.println( " ------ ");

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
