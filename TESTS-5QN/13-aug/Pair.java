public class Pair {
    public static void main(String[] args) {
        int[] a= {3,2,3,5,5,2};
        int n=a.length;
        if(n%2!=0){
            System.out.println("false");
        }
        else{
            int p=n/2;
            int[] f=new int[501];
            for(int i=0;i<n;i++){
                f[a[i]]++;
            }
            int flag=0;
            for(int i=0;i<501;i++){
                if(f[i]!=0){
                    if(f[i]%2!=0) {
                        System.out.println("false");
                        flag=1;
                        break;

                    }
                }
            }
            if(flag==0)
                System.out.println("true");
        }
    }
}
