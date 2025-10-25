import java.util.ArrayList;

public class BstToBalancedBst {  
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
        }
    }  
    public static void getinorder(Node root, ArrayList<Integer>inorder){
        if(root==null){
            return ;
        } 
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder); 
        
    } 
    public static Node createBst( ArrayList<Integer>inorder,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node node=new Node(inorder.get(mid));
        node.left=createBst(inorder,si,mid-1);
        node.right=createBst(inorder,mid+1,ei); 
        return node;
    }

    public static Node balancedBst(Node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getinorder(root,inorder); 
        root=createBst(inorder,0,inorder.size()-1);
        return root;
    } 
    public static void preorder(Node root){
        if(root==null){
            return;
        } 
        System.out.print(root.data+"_");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
        root=balancedBst(root); 
        preorder(root);

    }
}
