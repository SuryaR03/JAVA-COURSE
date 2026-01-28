import java.util.Scanner;

class ifelse{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int num =scan.nextInt();


        if(num%3==0 && num%5==0){
            System.out.println("div by 3 and 5");
        }else{
            System.out.print("not div by 3 and 5");
        }
    }
}