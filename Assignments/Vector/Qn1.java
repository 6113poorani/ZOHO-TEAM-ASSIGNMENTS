import java.util.Vector;

//1. Write a Java program that creates a `Vector` of integers. Add the numbers
//10, 20, 30, 40, and 50 to the vector. Retrieve and print the element at the
//second index (third element) in the vector. Then, print all elements in the vector.
public class Qn1 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v.get(2));
        System.out.println(v);


    }
}