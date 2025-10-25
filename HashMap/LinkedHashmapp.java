import java.util.*;

public class LinkedHashmapp {
    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 500);
        lhm.put("China", 400);
        lhm.put("US", 500);

        System.out.println(lhm);  // Prints all key-value pairs

        System.out.println(lhm.containsKey("India"));  // true
        lhm.remove("India");
        System.out.println(lhm.containsKey("India"));  // false
    }
}
