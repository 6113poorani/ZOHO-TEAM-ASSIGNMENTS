import java.util.Stack;

//2. Write a Java program that uses a `Stack` to reverse a string.
//For example, given the input string "hello", the program should output "olleh".
public class Qn2 {
    public static void main(String[] args) {
        String a="hello";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<a.length();i++){
            s.add(a.charAt(i));
        }
        String res="";
        while(!s.isEmpty()){
            res+=s.pop();
        }
        System.out.println(res);

    }
}
