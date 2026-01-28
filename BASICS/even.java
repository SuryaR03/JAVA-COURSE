import java.util.Scanner;

class even{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.print("Odd");
        }
        
    }
}