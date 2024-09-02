import java.util.PriorityQueue;
import java.util.Queue;

//Write a Java program that creates a `PriorityQueue` of integers.
//Add the numbers 5, 1, 3, 2, and 4 to the queue. Print the head of the queue
//using the `peek` method, then remove the head and print the entire queue to
//show the new order.
public class Qn2 {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        q.add(2);
        q.add(4);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
    }
}
