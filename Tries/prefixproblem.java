public class prefixproblem {  
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        } 
    }

    public static Node root = new Node();

    // Insert word into Trie
    public static void insert(String word) {
        Node curr = root; 
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    } 

    // Helper function to find unique prefix
    public static void findPrefix(Node root, String ans) {
        if (root == null) {
            return;
        }

        // if frequency == 1, unique prefix found
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = { "zebra", "dog", "duck", "dove" };

        for (String word : arr) {
            insert(word);
        }

        root.freq = -1; // Mark root as not part of any prefix
        findPrefix(root, "");
    } 
}
