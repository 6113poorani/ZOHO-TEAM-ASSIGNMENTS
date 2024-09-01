import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Write a Java program that creates a `LinkedHashSet` of strings with
//the values {"red", "green", "blue", "yellow"}. Convert the set to an array and
//print the array. Then, convert the array back to a `LinkedHashSet` and print the resulting set.
public class Qn3 {
    public static void main(String[] args) {
        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("red");
        linkedHashSet.add("green");
        linkedHashSet.add("blue");
        linkedHashSet.add("yellow");
        System.out.println(linkedHashSet);
        String[] arr=linkedHashSet.toArray(new String[0]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Set<String > newList=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(newList);

    }
}
