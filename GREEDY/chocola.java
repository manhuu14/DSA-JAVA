import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class chocola {
    public static void main(String args[]){ 
        int n=4, m=6;
        Integer horizantal[]={2,1,3,1,4};
        Integer vertical[]={4,1,2}; 

        Arrays.sort(horizantal,Collections.reverseOrder());
        Arrays.sort(vertical,Collections.reverseOrder()); 
        int h=0;int v=0;
        int vp=1;int hp=1;
        int cost=0;
        while (h<horizantal.length && v<vertical.length) {
            //vertical 
            if(vertical[v]<=horizantal[h]){
                cost+=(horizantal[h]*vp);
                hp++;
                h++; 
            }else{
                cost+=(vertical[v]*hp);
                vp++;
                v++;
            }
            while (h<horizantal.length) {
                cost+=horizantal[h]*vp;
                hp++;
                h++;
            }while (v<vertical.length) {
                cost+=vertical[v]*hp; 
                vp++;
                v++;
            }
        }
        System.out.println(cost);
    }
}
