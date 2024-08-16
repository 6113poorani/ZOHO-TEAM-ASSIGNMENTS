//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DivideByZero {
    public static void main(String[] args) {
        try{
        System.out.println(2/0);}
        catch(ArithmeticException e){
            System.out.println("Integer cannot divide by zero");
        }

    }
}