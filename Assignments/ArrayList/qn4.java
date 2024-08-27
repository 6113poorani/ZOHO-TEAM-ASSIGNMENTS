import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qn4 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>( Arrays.asList("apple", "banana", "cherry"));
        System.out.println(l);
        String[] a = l.toArray(new String[0]);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        List<String> newList=new ArrayList<>(Arrays.asList(a));
        System.out.println(newList);

    }
}
