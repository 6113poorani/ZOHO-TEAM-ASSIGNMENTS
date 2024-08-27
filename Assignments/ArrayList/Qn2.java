import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//2. Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}.
// Use an iterator to iterate
//through the list and remove all elements greater than 30. Print the modified list.
public class Qn2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Iterator<Integer> e = l.iterator();
        while (e.hasNext()) {
            int i = e.next();
            if (i > 30) {
                e.remove();
            }
        }

        System.out.println(l);
    }
}
