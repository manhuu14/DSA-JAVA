import java.util.PriorityQueue;

public class slidingwindowmaximum {
    static  class Pairs implements Comparable<Pairs>{
        int val;
        int idx;
        public Pairs(int val, int idx){
            this.val=val;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pairs p2){
            return p2.val-this.val;
        }
    }
    public static void main(String args[]){ 
        PriorityQueue<Pairs> pq=new PriorityQueue<>();
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        for(int i=0;i<k;i++){
            pq.add(new Pairs(arr[i], i));
        }
        res[0]=pq.peek().val;

        for(int i=k;i<arr.length;i++){
            while (pq.size()>0 && pq.peek().idx<=(i-k)) {
                pq.remove();
            }
            pq.add(new Pairs(arr[i], i));
            res[i-k+1]=pq.peek().val;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
