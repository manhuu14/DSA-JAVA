import java.util.HashSet;

public class countdistinctelements {
    public static void main(String args[]){
        int nums[]={4,3,2,5,6,7,3,2,1};
        HashSet<Integer> one=new HashSet<>(); 
        for(int i=0;i<nums.length;i++){
            one.add(nums[i]);
        } 
        System.out.println(one);

    }
}
