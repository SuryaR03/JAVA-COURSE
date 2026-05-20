import java.util.*;

class fact{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int fac=1;
        for(int i=n ; i>=1 ; i--){
            fac *=i;
        }
        System.out.println(fac);
    }
}