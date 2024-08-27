import java.util.ArrayList;
import java.util.List;

//3. Write a Java program that creates an `ArrayList`
//of characters. Add ten different characters to the list. Write a method that takes a
//character as an argument and returns the index of the character in the list.
//If the character is not found, return -1.
public class qn3 {
    public static void main(String[] args) {
        List<Character> l=new ArrayList<>();
        l.add('p');
        l.add('k');
        l.add('w');
        l.add('r');
        l.add('u');
        l.add('a');
        l.add('w');
        l.add('c');
        l.add('d');
        l.add('i');
        l.add('q');
        System.out.println(l.indexOf('i'));
        System.out.println(l.indexOf('d'));
        System.out.println(l.indexOf('b'));

    }
}
