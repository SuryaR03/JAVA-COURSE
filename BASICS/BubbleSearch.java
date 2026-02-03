
import java.util.*;


public class BubbleSearch{
    static void bubbleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        //System.out.println();
        }
    }



public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];

    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();       
    }

    bubbleSort(arr , n);

    printArray(arr, n);

}
}


