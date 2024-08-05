import java.util.Scanner;

import java.util.Scanner;
public class CountSay {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String a=scn.next();
        String ans="";
        int c=1,x=a.charAt(0);
        for(int i=1;i<a.length();i++){
            if(x==a.charAt(i)){
                c++;
            }
            else{
                ans+=c+""+(x-'0');
                c=1;x=a.charAt(i);
            }
        }
        ans+=c+""+(x-'0');
        System.out.println(ans);
    }
}
