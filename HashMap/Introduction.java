import java.util.*;
public class Introduction {
    public static void main(String args[]){
        //creatte
        HashMap<String,Integer> hm= new HashMap<>(); 

        //insert 
        hm.put("india", 100);
        hm.put("netherland", 200);
        hm.put("us", 55);
        System.out.println(hm);
        System.out.println(hm.get("us"));
        System.out.println(hm.containsKey("netherland"));
       // System.out.println(hm.remove("netherland"));
        System.out.println(hm.containsKey("netherland")); 

        
        //// set in hashmap is using to store all keys in a map 
        Set<String> keys=hm.keySet(); 
        System.out.println(keys);

    }
}
