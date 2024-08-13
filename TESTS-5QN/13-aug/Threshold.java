public class Threshold {
    public static void main(String[] args) {
        int[] a={5,8,10,13,6,2};
        int t=3;
        int n=a.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]<t) ans+=1;
            else if(a[i]%t==0)
                ans+=a[i]/t;
            else{
                ans+=a[i]/t+1;
            }
        }
        System.out.println(ans);
    }
}
