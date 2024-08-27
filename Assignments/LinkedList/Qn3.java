import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//3. Write a Java program that creates a `LinkedList` of integers. Add the
//numbers 1 to 10 to the list. Then, remove the third element (index 2)
//and the last element from the list. Print the resulting list.
public class Qn3 {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        l.remove(2);
        l.remove(l.size()-1);
        System.out.println(l);

    }
}
