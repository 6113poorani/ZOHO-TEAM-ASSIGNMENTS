import java.util.Scanner;

public class SubStringArray {
    static boolean find(String[] a,String x,int[] b){

        for(int i=0;i<a.length;i++){
            if(a[i].equals(x)){
                if(b[i]==1){
                    return false;
                }
                b[i]=1;
                return true;
            }
        }
        return false;
    }
    static String getString(String s,int i,int j){
        String ans="";
        for(int k=i;k<j;k++){
            ans+=s.charAt(k);
        }
        return ans;
    }
    static boolean check(int[] b){
        for(int i=0;i<b.length;i++){
            if(b[i]==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //String s=scn.next();
        String s="barfoofoobarthefoobarman";
        int n=scn.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=scn.next();
        }
        int[] b=new int[n];
        int k=a[0].length();
        String ans="";
        for(int i=0;i<s.length()-k;i++){
            b=new int[n];
            String t=getString(s,i,i+k);

            if(find(a,t,b)){
                for(int j=i+k;j+k-1<s.length();j++) {
                    String temp=getString(s,j,j+k);
                    if(find(a,temp,b)){
                        j+=k-1;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                if(check(b)){
                    ans+=i+" ";
                }
            }
        }

        System.out.println(ans);

    }
}
