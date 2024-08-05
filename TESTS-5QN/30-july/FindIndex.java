//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class FindIndex {
    static int find(int[] a,int target){
        int min=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==target)
                return i;
           if(a[i]<target){
                min++;
            }
           else break;

        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        System.out.println(find(a,target));
    }
}