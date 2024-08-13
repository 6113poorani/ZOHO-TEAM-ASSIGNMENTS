public class array0 {
    public static void main(String[] args) {
       int[] arr = {1,0,5,0,0};
       int n=arr.length;
       for(int i=0;i<n;i++){
           if(i!=n-1&&arr[i]==0){
              for(int j=n-1;j>i;j--){
                  arr[j]=arr[j-1];

              }
               System.out.println();
              arr[i+1]=0;
              i++;
           }

       }
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }


    }
}
