import java.util.HashMap;

public class LargestSubarray {
    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> hs=new HashMap<>();
        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hs.containsKey(sum)){
                len=Math.max(len,j-hs.get(sum));
            }else{
                hs.put(sum, j);
            }
        } 
        System.out.println(len);
    }
}
