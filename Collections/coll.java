
import java.util.*;


public class coll{
    public static void main(String[] args) {                      //we dont need to mention the size 
                                                                   //of an array here 
        List<Integer> li1=new LinkedList<>();
        li1.add(1);
        li1.add(2);
        li1.add(3);
        System.out.println(li1); 
        System.out.println(li1.size());
        System.out.println(li1.get(1));           //we are giving the index value inside the get()
    


        List<Integer> li2=new LinkedList<>();
        li2.add(6);
        li2.add(7);
        li2.add(8);
        System.out.println(li2);
        li1.addAll(li2);                                 //li2 elements get added in the li1
        System.out.println("adding li2 to li1"+li1);
        li1.removeAll(li2);
        System.out.println("After removing"+li1);
        

        li1.toArray();
        System.out.println(li1);
    }
}

