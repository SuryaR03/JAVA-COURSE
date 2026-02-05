
import java.util.*;


public class Mapiterator{
    public static void main(String[] args) {
        
        HashMap<String,Integer> num = new HashMap<>();
        num.put("Alice", 95);
        num.put("bob", 94);
        num.put("alan", 96);
        num.put("stew", 98);

        System.out.println("Iterating map using Map.Entry<> and entryset()");
        for (Map.Entry<String,Integer> en : num.entrySet())
            System.out.println("Student: "+ en.getKey() +", score: "+ en.getValue());

        System.out.println("==================================================");

        System.err.println("Iterating map using forEach() - Lambda function");
        num.forEach((key,value)->System.err.println("Student: "+ key + ", score: " + value));

        System.out.println("==================================================");

        System.out.println("Iterating map using keyset()");

        for(String s: num.keySet())
           System.out.println("Student: "+ s + ", score: "+num.get(s));

        System.out.println("==================================================");


        System.out.println("Iterating map using iterator");

        Iterator<Map.Entry<String,Integer>> it = num.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> en = it.next();
            System.err.println("Student: "+ en.getKey() +", Score : "+ en.getValue());
        }


    }
}