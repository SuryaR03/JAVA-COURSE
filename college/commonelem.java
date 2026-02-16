import java.util.Scanner;
public class commonelem {
    public static void main(String[] args) {
       //Type your code here
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();
       
       int m=sc.nextInt();
       int[] aarr=new int[m];
       for(int j=0;j<m;j++)
       aarr[j]=sc.nextInt();
       
       System.out.println("Common elements:");
       boolean foundAny=false;
       for(int i=0;i<n;i++){
           boolean alreadyPrinted=false;
           for(int k=0;k<i;k++){
               if(arr[i]==arr[k]){
                   alreadyPrinted=true;
                   break;
               }
           }
           if(alreadyPrinted)
           continue;
           
           for(int j=0;j<m;j++){
               if(arr[i]==aarr[j]){
                   System.out.print(arr[i]+" ");
                   foundAny=true;
                   break;
               }
           }
       }
       if(!foundAny){
           System.out.println("No common elements found.");
       }
    }
}