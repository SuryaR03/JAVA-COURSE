import java.util.*;

public class Maphash{
    public static void main(String[] args) {
        
        TreeMap<String,Integer> num= new TreeMap<>();

        num.put("reg1", 1);
        num.put("reg2", 2);
        num.put("reg3", 3);
        num.put("reg4", 4);

        System.out.println("All reg no :"+num);

        System.out.println("key :"+num.keySet());           //return key value

        System.err.println("values :"+num.values());         //return values

        System.err.println("Entries: "+ num.entrySet());        //key with values

        System.err.println("get the value: "+ num.get("reg2"));        //specific value of the key given

        System.err.println("Entries: "+ num.containsKey("reg1"));     //boolean
 
        System.err.println("Entries: "+ num.replace("reg2",6));        //replace
        
        int value = num.remove("reg3");
        System.err.println("removed value : "+value);
    }
}