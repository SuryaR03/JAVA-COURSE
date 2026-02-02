
import java.util.*;


public class iterator{
    public static void main(String[] args) {
        
        List<String> list=new LinkedList<>();        //creating the list

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        Iterator<String> itr= list.iterator();
        System.out.println();
        while(itr.hasNext()){
            String fruit = itr.next();
            System.err.println(fruit);
        }
        System.err.println("After printed");
        Iterator<String> itr2= list.iterator();
        while(itr2.hasNext())
        {
            String fruit = itr2.next();

            if(fruit.equals("banana"))
            itr2.remove();
            else
            System.err.println(fruit);
        }
    }
}
