import java.util.*;

public class ARRAYLIST{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }
        System.out.println(ar);
        ListIterator<Integer> itr = ar.listIterator();
        if(itr.hasNext()){
            System.out.println(itr.next());
            System.out.println(itr.nextIndex());
            System.out.println(itr.hasNext());
        }else{
            System.out.println("Array list is empty");
        }


    }
}