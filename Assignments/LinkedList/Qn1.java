//1.Write a Java program that creates a `LinkedList` of integers. Add the numbers
//5, 10, 15, 20, and 25 to the list. Retrieve and print the first and
//last elements in the list.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Qn1{
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>(Arrays.asList(5,10,15,20,25));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());

    }
}