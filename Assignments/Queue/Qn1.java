import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//Create a Java program that initializes a `Queue` of strings with the
//values {"apple", "banana", "cherry", "date"}. Use an iterator to print
//each element in the queue.
public class Qn1{
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("apple");
        q.add("banana");
        q.add("cherry");
        q.add("date");
        Iterator<String> e=q.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}