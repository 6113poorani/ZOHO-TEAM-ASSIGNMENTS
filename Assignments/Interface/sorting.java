import java.util.*;
interface Sortable{
    void sortArray(int[] a);
}
class BubbleSort implements Sortable{
    public void sortArray(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
}
class MergeSort implements Sortable{
    public void sortArray(int[] a){
        mergeSort(a,0,a.length-1);
    }
    static void mergeSort(int[] a,int i,int j){
        if(i<j){
            int m=(i+j)/2;
            mergeSort(a,i,m);
            mergeSort(a,m+1,j);
            merge(a,i,m,j);
        }
    }
    static void merge(int[] arr,int r1,int m,int c1){
        int[] a=new int[m-r1+1];
        int[] b=new int[c1-m];
        for(int i=0;i<a.length;i++){
            a[i]=arr[r1+i];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[m+i+1];
        }
        int n1=a.length,n2=b.length;
        int i=0,j=0;
        int in=r1;
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                arr[in++]=a[i++];
            }
            else arr[in++]=b[j++];

        }
        while(i<n1){
            arr[in++]=a[i++];
        }
        while(j<n2){
            arr[in++]=b[j++];
        }
    }
}



class QuickSort implements Sortable {

    public void sortArray(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Swap array[i + 1] and array[high] (or pivot)
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
}

public class sorting {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        System.out.println("Enter you choice : ");
        System.out.println("1.Bubble Sort \n2.MergeSort \n3.Quick Sort");
        int choice=scn.nextInt();
        Sortable s=null;
        switch(choice){
            case 1:{
                s=new  BubbleSort();
                s.sortArray(a);
                break;
            }
            case 2:{
                s=new  MergeSort();
                s.sortArray(a);
                break;
            }
            case 3:{
                s=new  QuickSort();
                s.sortArray(a);
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
