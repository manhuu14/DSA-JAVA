public class SORTEDTOBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }


    public static Node createBst(int arr[], int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node node = new Node(arr[mid]);
        node.left = createBst(arr, si, mid - 1);
        node.right = createBst(arr, mid + 1, ei);
        return node;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = createBst(arr, 0, arr.length - 1);
        preorder(root);
    }
}
