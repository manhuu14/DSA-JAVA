import java.util.HashSet;

public class basics{
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("india");
        cities.add("china");
        cities.add("vizag");
        System.out.println(cities);
        System.out.println(cities.contains("india"));
        System.out.println(cities.remove("china")); 
        System.out.println(cities.contains("china"));
    }
}