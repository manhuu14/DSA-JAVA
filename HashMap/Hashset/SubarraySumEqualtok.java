import java.util.HashMap;

public class SubarraySumEqualtok {
    public static void main(String args[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]={10,-2,2,-20,10};
        int k=-10; 
        int sum=0;
        int ans=0;
        hm.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);

        } 
        System.out.println(ans);
        
    }
}
