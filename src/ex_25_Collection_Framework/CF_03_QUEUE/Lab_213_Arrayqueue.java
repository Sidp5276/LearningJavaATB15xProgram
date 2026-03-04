package ex_25_Collection_Framework.CF_03_QUEUE;
import java.util.*;
public class Lab_213_Arrayqueue {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        System.out.println(deck);
    }
}
