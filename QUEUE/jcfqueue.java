//stacks are often implemented as classes beacuse their sample, linear operations(push/pop) fit well object-oriented design, 
//offering clear encapsulation queues being more complex in same cases may be iplemented using flexible structures like arrays or linked list instead

import java.util.LinkedList;
import java.util.Queue;

public class jcfqueue {
    public static void main(String args[]){
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
