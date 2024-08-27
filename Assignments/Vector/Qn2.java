import java.util.Vector;

//2. Write a Java program that creates a `Vector` of doubles. Add five
//random double values to the vector. Check if the value 10.5 is in
//the vector. Print the size of the vector before and after adding an additional value.
public class Qn2 {
    public static void main(String[] args) {
        Vector<Double> v=new Vector<>();
        System.out.println("Before Adding the elements : "+v.size());
        v.add(11.3); v.add(1.3);
        v.add(12.5); v.add(10.3);
        v.add(10.5); v.add(13.3);
        System.out.println("After adding the elements : "+v.size());
        System.out.println(v.indexOf(Double.valueOf(10.5)));
        System.out.println(v);
    }
}
