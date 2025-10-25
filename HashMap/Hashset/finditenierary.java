import java.util.*;
public class finditenierary {
    public static String getStarted(HashMap<String,String> tickets){
        HashMap<String,String> revmap=new HashMap<>();
        for(String ticket:tickets.keySet()){
            revmap.put(tickets.get(ticket), ticket);
        }
        for(String key:tickets.keySet()){
            if((!revmap.containsKey(key))){
                return key; 
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai","Bengluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa"); 
        String start=getStarted(tickets); 
        System.out.print(start+"->");
        for(String key:tickets.keySet()){
            System.out.print(tickets.get(start)+"->");
            start=tickets.get(start);
        }
    }
}
