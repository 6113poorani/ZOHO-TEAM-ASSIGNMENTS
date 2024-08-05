import java.util.*;
public class ValidParenthesis {
    static List<String> l=new ArrayList<>();
    static boolean valid(String[] a){
        int n=a.length/2;
        int s=1,e=1,sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=="("){
                sum+=s;
            }
            if(a[i]==")"){
                if(sum==0) return false;
                sum-=e;
            }
        }
        return true;
    }
    static void swap(String[] a,int i,int j){
        String t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    static boolean shouldSwap(String[] p, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (p[i].equals(p[curr])) {
                return false;
            }
        }
        return true;
    }

    static void permute(int id,String[] p){
        if(id>=p.length){
            if(p[0]!=")") {

                if(valid(p)){
                // System.out.println(Arrays.toString(p));
                    String ans="";
                    for(int i=0;i<p.length;i++) ans+=p[i];
                    l.add(ans);
                }
            }
        }
        for(int i=id;i<p.length;i++){
            if (shouldSwap(p, id, i)) {
                swap(p, id, i);
                permute(id + 1, p);
                swap(p, id, i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        String[] p=new String[n*2];
        int k=0;
        for(int i=0;i<n;i++){
            p[k++]="(";
        }
        for(int i=0;i<n;i++){
            p[k++]=")";
        }

        permute(0,p);
        for(int i=0;i<l.size();i++) {
            System.out.println(l.get(i));
        }
    }
}
