import java.util.Scanner;

class ifelse{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int mark =scan.nextInt();


        if(mark<40){
            System.out.println("Fail");
        }else{
            System.out.print("Pass");
        }
    }
}