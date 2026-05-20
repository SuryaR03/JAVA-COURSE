import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int length=0;
        int original = n;

        while(n>0){
            n=n/10;
            length++;
        }
        n=original;
        int sum=0;

        while(n>0){
            int rem = n%10;
            sum+=(int)Math.pow(rem,length);
            n=n/10;
        }
        if(original==sum){
            System.out.println("Armstrong numnber");
        }else{
            System.out.println("Not an armstroing number");
        }
    }
}