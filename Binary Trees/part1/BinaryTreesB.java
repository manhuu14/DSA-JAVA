import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesB { 
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    } 
    public static class BinaryTree{
        static int idx=-1;
        public static Node buidTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            } 
            Node newNode=new Node(nodes[idx]);
            newNode.left=buidTree(nodes);
            newNode.right=buidTree(nodes);
            return newNode;
        } 
        public static void preorder(Node root){//pre-order says that simply (DFS)
            if(root==null){
                return;
            } 
            System.out.print(root.data+"-");
            preorder(root.left);
            preorder(root.right);

        } 
        public static void Inorder(Node root){
        if(root==null){
            return;
        } 
        Inorder(root.left);
        System.out.print(root.data+"{+}"); 
        Inorder(root.right); 
    } 
    public static void PostOrder(Node root){
        if(root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+"%");
    }
    public static void levelorder(Node root) {
    if (root == null) {
        return;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);  // Marker for end of level

    while (!q.isEmpty()) {
        Node currNode = q.remove();

        if (currNode == null) {
            System.out.println();  // End of current level
            if (!q.isEmpty()) {
                q.add(null);  // Add marker for next level
            }
        } else {
            System.out.print(currNode.data + " ");
            if (currNode.left != null) {
                q.add(currNode.left);
            }
            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }
}

    }  
    
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        BinaryTree tree=new BinaryTree();
        Node root=tree.buidTree(nodes);
        System.out.println(root.data); 
        tree.preorder(root); 
        System.out.println();
        tree.Inorder(root);  
        System.out.println();
        tree.PostOrder(root); 
        System.out.println();
    }
}
