import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AcitiveSelection2 {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={9,4,6,7,9,2}; 

        int activites[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        } 

        //we use lamda functions for sorting the matrix arrays
        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2])); 
        //end time basis sorted 
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>(); 
        ans.add(activites[0][0]);
        int lastend=activites[0][2];
        for(int i=1;i<end.length;i++){
            if(activites[i][1]>=lastend){
                maxAct++;
                ans.add(activites[i][0]);
            }
        } 
        System.out.println("Maxx acts is ="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+"  ");
        }
    }
}
