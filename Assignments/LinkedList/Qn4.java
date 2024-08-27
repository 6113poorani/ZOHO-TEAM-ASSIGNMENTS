import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//4. Write a Java program that creates a `LinkedList` of characters with the
//values {'A', 'B', 'C', 'D', 'E'}. Write a method to reverse the linked list
//and print the reversed list.
public class Qn4 {
    public static void main(String[] args) {
        List<Character> l=new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        Collections.reverse(l);
        System.out.println(l);
    }
}
