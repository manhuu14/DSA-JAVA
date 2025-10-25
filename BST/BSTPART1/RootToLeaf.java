import java.util.ArrayList;

public class RootToLeaf{ 
    public  static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    } 
    // inserting the nodes to bst
    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        } 
        if(root.data>val){
            root.left=insert(root.left,val);
        } 
        if(root.data<val){
            root.right=insert(root.right,val);
        } 

        return root;
    }   
    //searching the key in bst 
    public static boolean Searchbst(Node root,int key){ 
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return Searchbst(root.left, key);
        } 
        else{
            return Searchbst(root.right,key);
        } 
    }  
    //printing the values of bst inorder
    public static void inorder(Node root){
        if(root==null){
            return;
        } 
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
 
    } 
    //finding how many paths have from root to leaf
    public static void Roootfromroottoleaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }
        Roootfromroottoleaf(root.left, path);
        Roootfromroottoleaf(root.right, path);
        path.remove(path.size()-1);
    } 
    //printing paths
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    } 
    
    //testing the binary serch tree is valid or not means correct or not
    public static boolean isvalidbst(Node root, Node max, Node min){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        } 
        return isvalidbst(root.left, root, min) && isvalidbst(root.right, max, root);
    } 
    // MIRROR A BST 
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }

        Node leftmirror=createMirror(root.left);
        Node rightmirror=createMirror(root.right); 

        root.right=leftmirror;
        root.left=rightmirror;

        return root;
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        } 
        //Roootfromroottoleaf(root, new ArrayList<>());  
        System.out.println(isvalidbst(root,null,null)); 
        createMirror(root); 
        inorder(root);
    }
}