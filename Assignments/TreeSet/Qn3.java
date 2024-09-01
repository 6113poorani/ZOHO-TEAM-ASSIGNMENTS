import java.util.Set;
import java.util.*;
//Write a Java program that creates a `TreeSet` of doubles with the values
//{1.1, 2.2, 3.3, 4.4, 5.5}. Use the `first()`, `last()`, `higher()`, and `lower()`
//methods to retrieve and print the first element, last element, the smallest element strictly greater than 3.3, and the largest element strictly less than 3.3.
public class Qn3 {
    public static void main(String[] args) {
        TreeSet<Double> s = new TreeSet<>();
        s.add(1.1);
        s.add(2.2);
        s.add(3.3);
        s.add(4.4);
        s.add(5.5);
        System.out.println(s);
        System.out.println("First Element : "+s.first());
        System.out.println("Last Element :"+s.last());
        System.out.println(s.higher(3.3));
        System.out.println(s.lower(3.3));
    }
}
