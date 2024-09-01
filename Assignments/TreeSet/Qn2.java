import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Write a Java program that creates a `TreeSet` of strings with a
//custom comparator that orders strings by their length.
//Add the strings {"banana", "apple", "cherry", "date"} to the set.
//Print the elements to verify the custom ordering.
public class Qn2 {
    public static void main(String[] args) {
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lenCompare = Integer.compare(s1.length(), s2.length());
                return lenCompare != 0 ? lenCompare : s1.compareTo(s2);
            }
        };
        Set<String> treeSet=new TreeSet<>(lengthComparator);
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");
        treeSet.add("date");
        System.out.println(treeSet);
    }
}
