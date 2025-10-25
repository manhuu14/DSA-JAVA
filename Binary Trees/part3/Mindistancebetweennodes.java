import java.util.ArrayList;

public class Mindistancebetweennodes {
    public static class  Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
        
    }  
    public static Node lca2(Node root, int n1, int n2){ 
        if(root==null){
            return null;
        } 
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node lefNode=lca2(root.left, n1, n2);
        Node rigNode=lca2(root.right, n1, n2);
        if(rigNode==null){
            return lefNode;
        } 
        if(lefNode==null){
            return rigNode;
        } 
        return root;
    } 
    public static int minimumdistancebwnodes(Node root, int n1, int n2){
        Node lca=lca2(root, n1, n2);
        int dist1=dist(lca,n1);
        int dist2=dist(lca,n2); 
        return dist1+dist2;
    } 
    public static int dist(Node root,int n){ 
        if(root==null){
            return-1;
        } 
        if(root.data==n){
            return 0;
        }
        int leftdist=dist(root.left, n);
        int rightdist=dist(root.right, n);  
        if(leftdist==-1 && rightdist==-1){
            return-1;
        }else if(leftdist==-1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
        
    }
    public static void main(String args[]){
        Node  root=new Node(1); 
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6); 
        root.right.right=new Node(7); 
        System.out.println(lca2(root, 4, 7).data);    
        //System.out.println(lca(root, 4, 5)); 
        // System.out.println();  
        System.out.println(minimumdistancebwnodes(root, 4, 7));
    }
}
