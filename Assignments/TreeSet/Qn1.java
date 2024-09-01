import java.util.Set;
import java.util.TreeSet;

//Write a Java program that creates a `TreeSet` of integers.
//Add the numbers 50, 30, 20, 10, and 40 to the set.
//Print all elements in the set and observe the order.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Qn1 {
    public static void main(String[] args) {
    Set<Integer> treeSet=new TreeSet<>();
    treeSet.add(50);
    treeSet.add(30);
    treeSet.add(20);
    treeSet.add(10);
    treeSet.add(40);
        System.out.println(treeSet);

    }
}