import java.util.Stack;

//Valid Parenthesis
public class Qn3 {
    static boolean valid(String a){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='(')
                s.push('(');
            else{
                if(s.isEmpty())
                    return false;
                if(s.peek()==')')
                    return false;
                s.pop();
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        if(valid("((()())())"))
        System.out.println("Balanced");
        else
        System.out.println("Not Balanced");


    }
}
