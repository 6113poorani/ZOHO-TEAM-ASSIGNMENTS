import java.util.ArrayList;
import java.util.List;
//1. Write a Java program that creates an `ArrayList` of strings.
//Add five different fruits to the list, then retrieve and print
//the third fruit in the list.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Qn1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     List<String> l=new ArrayList<>();
     l.add("Apple");
     l.add("banana");
     l.add("Guva");
     l.add("PineApple");
     l.add("WaterMelon");
        System.out.println(l.get(2));
    }
}