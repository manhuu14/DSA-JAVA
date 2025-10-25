import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class indiancoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfcoins=0;
        ArrayList<Integer>  ans=new ArrayList<>();
        int amount=590;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while (coins[i]<=amount) {
                    countOfcoins++;
                    amount-=coins[i];
                    ans.add(coins[i]);
                }
            }
        } 
        System.out.println("the total coins is required="+countOfcoins);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
