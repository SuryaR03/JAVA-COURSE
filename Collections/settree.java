import java.util.*;

public class settree {
    public static void main(String[] args) {

        TreeSet<Integer> s=new TreeSet<>();
        s.add(5);
        s.add(7);
        s.add(6);
        s.add(8);
        s.add(2);
        System.out.println("Elements in set "+s);
        System.out.println("Elements in set "+ s.ceiling(4));
        System.out.println("first value "+s.first());
        System.out.println("Last value "+s.last());
        System.out.println("Floor value "+s.floor(3));
        System.out.println("higher in set "+s.higher(5));
        System.out.println("Lower in set "+s.lower(5));
        System.out.println("starting values in set "+s.headSet(7,true));
        System.out.println("Ending values in set "+s.tailSet(5));
        System.out.println("Elements in set "+s.subSet(5,7));



        //System.out.println("pollfirst in set "+s.pollFirst());
        //System.out.println("polllast in set "+s.pollLast());
    }
}