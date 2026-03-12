import java.util.*;

public class removesecelem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list= new ArrayList<>();

        int n=sc.nextInt();
        for(int i =0 ;i < n;i++){
            list.add(sc.nextInt());
        }

        ListIterator<Integer> iterator = list.listIterator();
        boolean removeElement =false;

        while(iterator.hasNext()){
            iterator.next();
            removeElement=!removeElement;

            if(removeElement){
                iterator.remove();
            }
        }
        
        System.out.println(list);
    }
}