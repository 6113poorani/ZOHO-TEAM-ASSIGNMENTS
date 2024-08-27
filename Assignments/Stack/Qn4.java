import java.util.Collections;
import java.util.Stack;
//4. Write a Java program that initializes a `Stack` of doubles with the
//values {1.1, 2.2, 3.3, 4.4, 5.5}. Convert the stack to an array and print the array.
//Then, create a new stack from the array and print the elements of the new stack.
public class Qn4 {
    public static void main(String[] args) {
    Stack<Double> s=new Stack<>();
    s.push(1.1);s.push(2.2);
    s.push(3.3);s.push(4.4);
    s.push(5.5);
        System.out.println(s);
       double[] a=new double[s.size()];
       int i=s.size()-1;
       while(!s.isEmpty()){
           a[i--]=s.pop();
       }
       for(double k:a){
           System.out.print(k+" ");
       }
        System.out.println();
        Stack<Double> s1=new Stack<>();
        for(int i1=0;i1<a.length;i1++)
            s1.push(a[i1]);
        System.out.println(s1);
    }
}
