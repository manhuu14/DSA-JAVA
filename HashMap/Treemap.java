import java.util.TreeMap;

public class Treemap {
    public static void main(String args[]){
        TreeMap<String,Integer> tmp= new TreeMap<>();
        tmp.put("India",400);
        tmp.put("Argentina",4);
        System.out.println(tmp);
        System.out.println(tmp.containsKey("India"));
    }
}
