import java.util.Scanner;

class fibonnaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci Series: 0 1");

        int f=0;
        int s=1;

        for(int i =3;i<=n;i++){
            int t=f+s;
            System.out.print(" "+t);
            f=s;
            s=t;
        }
    }
}