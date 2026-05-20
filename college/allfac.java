import java.util.Scanner;

class allfac{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int result=0;
        System.out.print("Factors of 12 are:");
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);
            }
        }
    }
}