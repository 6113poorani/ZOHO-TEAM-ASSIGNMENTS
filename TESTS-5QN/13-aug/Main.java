//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scn=new Scanner(System.in);

        int[] a={8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int n=a.length;

        int k=scn.nextInt();
      /*  for(int i=0;i<=n-k;i++){
            int ans=a[i];
            for(int j=i;j<i+k;j++){
                if(ans<a[j]){
                    ans=a[j];
                }
            }
            System.out.println(ans);
        }*/
        int m=0,in=0;
        for(int i=0;i<k;i++){
            if(m<a[i]){
                m=a[i];
                in=a[i];
            }
        }
        System.out.println(m);
        for(int i=k;i<n;i++){
            if(in>i-k){
                if(m<a[i]){
                    m=a[i];
                    in=i;
                }
                System.out.println(m);
            }
            else{
                int k1=k-1,index=i-1;
                m=a[i];
                while(k1>0){
                    if(m<a[index]){
                        m=a[index];
                        in=k1;
                    }
                    index--;
                    k1--;
                }
                System.out.println(m);
            }
        }
    }
}