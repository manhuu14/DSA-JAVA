import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String args[]){
        LinkedHashSet<Integer> lhm= new LinkedHashSet<>();
        lhm.add(1);
        lhm.add(2);
        System.out.println(lhm); 
        lhm.remove(2);
        System.out.println(lhm.contains(2)); 

    }
}
