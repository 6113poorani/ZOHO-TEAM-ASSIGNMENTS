import java.util.LinkedHashSet;
import java.util.Set;
//Write a Java program that creates a `LinkedHashSet` of integers.
//Add the numbers 5, 10, 15, 20, and 25 to the set. Attempt to add the number 15 again.
//Print all elements in the set and observe the order and duplicates.

public class Qn1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(15);
        linkedHashSet.add(20);
        linkedHashSet.add(25);
        linkedHashSet.add(15);
        System.out.println(linkedHashSet);



    }
}