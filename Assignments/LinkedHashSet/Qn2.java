import java.util.LinkedHashSet;
import java.util.Set;

//Write a Java program that creates a `LinkedHashSet` of characters with
//the values {'A', 'B', 'C', 'D', 'E'}. Remove the character 'C' from the set.
// Check if 'C' is still in the set and print the resulting set.
public class Qn2 {
    public static void main(String[] args) {
        Set<Character> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add('A');
        linkedHashSet.add('B');
        linkedHashSet.add('C');
        linkedHashSet.add('D');
        linkedHashSet.add('E');
        linkedHashSet.remove('C');
        System.out.println(linkedHashSet);

    }
}
