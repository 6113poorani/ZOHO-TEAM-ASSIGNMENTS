//1. Write a Java program that creates a `Stack` of integers. Push the
//numbers 10, 20, 30, 40, and 50 onto the stack. Then, pop the top element and
//print the remaining elements in the stack.

import java.util.Stack;

public class Qn1{
    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    s.push(10);s.push(20);
        s.push(30);s.push(40);
        s.push(50);
        System.out.println(s);
        System.out.println("After poppinf the First Elements : ");
        s.pop();
        System.out.println(s);

    }
}