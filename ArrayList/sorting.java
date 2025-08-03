import java.util.ArrayList;
import java.util.Collections;
public class sorting {
    //collections.sort()
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4); 

        System.out.println(list); 
        //assending order
        Collections.sort(list);
        System.out.println(list);
        //desending 
        Collections.sort(list,Collections.reverseOrder());
    }
}
