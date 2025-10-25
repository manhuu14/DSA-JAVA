import java.util.ArrayList;

public class Heap { 
    static class Heapchild {
        ArrayList<Integer> al = new ArrayList<>();

        // Add element to Min Heap
        public void add(int data) {
            al.add(data);
            int x = al.size() - 1; // index of new element
            int par = (x - 1) / 2; // parent index

            // Bubble up
            while (x > 0 && al.get(par) > al.get(x)) {
                int temp = al.get(x);
                al.set(x, al.get(par));
                al.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        // Remove root element (min)
        public void remove() {
            if (al.size() == 0) return;

            // Swap root with last element
            int temp = al.get(0);
            al.set(0, al.get(al.size() - 1));
            al.set(al.size() - 1, temp);

            // Remove last
            al.remove(al.size() - 1);

            // Heapify down
            heapify(0);
        }

        // Heapify function
        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < al.size() && al.get(minIdx) > al.get(left)) {
                minIdx = left;
            }
            if (right < al.size() && al.get(minIdx) > al.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = al.get(i);
                al.set(i, al.get(minIdx));
                al.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        // Peek (return root)
        public int peek() {
            return al.get(0);
        }

        // Check if heap is empty
        public boolean isEmpty() {
            return al.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heapchild pq = new Heapchild(); // ✅ correct object

        pq.add(3);
        pq.add(4);
        pq.add(2);

        while (!pq.isEmpty()) { // ✅ add ()
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
