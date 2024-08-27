//3. Write a Java program that initializes a `Vector` of strings with the
//values {"red", "green", "blue", "yellow"}. Convert the vector to an array,
//print the array, then convert the array back to a vector and print the resulting vector.

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Qn3 {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>(Arrays.asList("red", "green", "blue", "yellow"));
        System.out.println(v);
        String[] a=v.toArray(new String[0]);
        for(String e:a){
            System.out.println(e);
        }
        Vector<String> v1=new Vector<>(Arrays.asList(a));
        System.out.println(v1);

    }
}
