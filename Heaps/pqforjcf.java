import java.util.PriorityQueue;

public class pqforjcf {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(2);
        pq.add(1);//(0(logn)) for add and (0(logn))  and (0(1)) for the peek(); 
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
