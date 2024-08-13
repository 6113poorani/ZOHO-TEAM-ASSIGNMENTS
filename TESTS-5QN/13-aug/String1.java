public class String1 {
    public static void main(String[] args) {
        String s1="ststringthistest123string123";
        String s2="string";
        int flag=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                int h=i;
                i++;
                int j=1;
                for( j=1;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        i++;
                    }
                    else{
                        break;
                    }

                }
                if(j==s2.length()){
                    flag=1;
                    System.out.println(h);
                break;}
                i=h;
            }


        }
        if(flag==0){
            System.out.println(-1);
        }

    }
}
