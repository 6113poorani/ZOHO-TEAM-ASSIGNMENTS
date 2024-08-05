import java.util.Scanner;
public class RomanToInteger {
    static int romanInt(char x){
        if(x=='I')
            return 1;
        if(x=='V')
            return 5;
        if(x=='X')
            return 10;
        if(x=='L')
            return 50;
        if(x=='C')
            return 100;
        if(x=='D')
            return 500;
        return 1000;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String arr=scn.next();
        int sum=0,a=0,b=0,i,f=0;
        for(i=0;i<arr.length()-1;i++){
            char a1=arr.charAt(i);
            char a2=arr.charAt(i+1);
             a=romanInt(arr.charAt(i));
             b=romanInt(arr.charAt(i+1));
            if(a>=b){
                sum+=a;
            }
            else{
                if((a1=='I'&&(a2=='V'||a2=='X'))||
                        (a1=='X'&&(a2=='L'||a2=='C')) ||
                        (a1=='C'&&(a2=='D'||a2=='M'))){
                sum+=(b-a);
                i++;}
                else{
                    System.out.println("Invalid ");
                    f=1;
                    break;
                }
            }

        }
        if(a>=b){
            sum+=romanInt(arr.charAt(i));
        }
        if(f==0)
        System.out.println(sum);
    }
}
