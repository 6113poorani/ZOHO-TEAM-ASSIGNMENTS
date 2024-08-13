public class Binary {
    static String reverse(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
    public static void main(String[] args) {
        int a=124;
        int a1=44;
        int b=5;
        String m1=""+a;
        String m2=""+a1;
        String m="",n="";
        if(m1.length()>m2.length()) {
            m = reverse(m1);
            n = reverse(m2);
        }
        else{
            m=reverse(m2);
            n=reverse(m1);
        }


        int c=0;
        String ans="";

        int i=0;
        for(i=0;i<n.length();i++){
            int q=(m.charAt(i)-'0')+(n.charAt(i)-'0')+c;
            ans=(q%b)+""+ans;

            c=q/b;

        }
        while(i<m.length()){
            int q=(m.charAt(i)-'0')+c;
            ans=(q%b)+""+ans;
            c=q/b;
            i++;
        }
        if(c>0)
            ans=c+""+ans;
        System.out.println(ans);

    }
}
