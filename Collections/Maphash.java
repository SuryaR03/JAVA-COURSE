import java.util.*;

public class Maphash{
    public static void main(String[] args) {
        
        TreeMap<String,Integer> num= new TreeMap<>();

        num.put("reg1", 1);
        num.put("reg2", 2);
        num.put("reg3", 3);
        num.put("reg4", 4);
        num.put("reg5", 5);

        System.out.println("All reg no :"+num);

        System.out.println("key :"+num.keySet());           //return key value

        System.err.println("values :"+num.values());         //return values

        System.err.println("Entries: "+ num.entrySet());        //key with values

        System.err.println("get the value: "+ num.get("reg2"));        //specific value of the key given

        System.err.println("Entries: "+ num.containsKey("reg1"));     //boolean
 
        System.err.println("Entries: "+ num.replace("reg2",6));        //replace

        System.out.println("first key: "+ num.firstKey());           //return first 

        System.out.println("last key: "+ num.lastKey());          //retrun last

        System.out.println("first enrty: "+ num.firstEntry());          //with value

        System.out.println("last Entry: "+ num.lastEntry());

        System.out.println("higher key: "+ num.higherKey("reg1"));         //strict greater
        System.out.println("higher Entry: "+ num.higherEntry("reg1"));

        System.out.println("lower key: "+ num.lowerKey("reg2"));           //strict lower
        System.out.println("lower entry: "+ num.lowerEntry("reg2"));

        System.out.println("ceiling key: "+ num.ceilingKey("reg4"));      //greater than or equal
        System.out.println("ceiling entry: "+ num.ceilingKey("reg4"));

        System.out.println("floor key: "+ num.floorKey("reg3"));           //less than or equal
        System.out.println("floor entry: "+ num.floorKey("reg3"));

        System.out.println("poll first entry: "+ num.pollFirstEntry());     //remove and return 
        System.out.println("poll last entry: "+ num.pollLastEntry());
    }
}