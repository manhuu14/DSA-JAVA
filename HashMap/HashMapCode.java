import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total number of key-value pairs
        private int N; // total number of buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // hash function: converts key to bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // searches for key in the linked list at given bucket index
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) { // use equals() instead of ==
                    return i;
                }
            }
            return -1;
        }

        // rehashing: double the bucket size when load factor > 2.0
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0; // reset count and re-insert all old key-value pairs
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        // put(): add or update a key-value pair
        public void put(K key, V value) {
            int bi = hashFunction(key); 
            int di = searchInLL(key, bi);       
                                                                                          
            if (di != -1) { // key already exists → update
                Node node = buckets[bi].get(di);
                node.value = value; 
            } else { // new key → insert
                buckets[bi].add(new Node(key, value));
                n++; 
            } 
            double lambda = (double) n / N; // load factor
            if (lambda > 2.0) {
                rehash();  
            } 
        }

        // get(): returns value for key
        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        // remove(): deletes key and returns its value
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        // containsKey(): checks if key exists
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        // keySet(): returns all keys
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i]; 
                for (Node node : ll) {  
                    keys.add(node.key);  
                }
            }
            return keys;
        } 

        // isEmpty(): returns true if no key-value pairs
        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 888);
        hm.put("USA", 300);
        hm.put("Nepal", 50);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " → " + hm.get(key));
        }

        System.out.println("\nGet India: " + hm.get("India"));
        System.out.println("Remove India: " + hm.remove("India"));
        System.out.println("Get India after remove: " + hm.get("India"));
        System.out.println("Contains China? " + hm.containsKey("China"));
        System.out.println("Is Empty? " + hm.isEmpty());
    }
}
