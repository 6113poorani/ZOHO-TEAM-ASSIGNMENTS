import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Create a Java program that initializes a `LinkedList` of strings with
//the values {"one", "two", "three", "four", "five"}. Use a `ListIterator` to iterate
//through the list and
//replace every occurrence of the word "three" with "THREE".
//Print the modified list.
public class Qn2 {
    public static void main(String[] args) {
        List<String> l=new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five"));
        ListIterator<String> e=l.listIterator();
        while(e.hasNext()) {
            if(e.next().equals("three"))
            e.set("THREE");
        }
        System.out.println(l);

    }
}
