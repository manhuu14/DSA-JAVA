import java.lang.reflect.Array;
import java.util.ArrayList;

public class Merge2Bst {
    public static class  Node {
            int data;
            Node left;
            Node right;
            public Node(int data){
                this.data=data;  
            }
    }  
    public static void getInorder(ArrayList<Integer>abc,Node root){
        if(root==null){
            return;
        } 
        getInorder(abc,root.left);  
        abc.add(root.data);
        getInorder(abc, root.right);

    }
    public static Node Merge2Bst(Node root1, Node root2){
        ArrayList<Integer> al1=new ArrayList<>(); 
        getInorder(al1,root1);
        ArrayList<Integer>al2=new ArrayList<>();
        getInorder(al2,root2);
        ArrayList<Integer>fsinal= new ArrayList<>();
        int i=0,j=0; 
        while (i<al1.size() && j<al2.size()) {
            if(al1.get(i)<al2.get(j)){
                fsinal.add(al1.get(i)); 
                i++;
            }else{
                fsinal.add(al2.get(j));
                j++;
            }
        } 
        while (i<al1.size()) {
            fsinal.add(al1.get(i));
            i++;
        }
        while (j<al1.size()) {
            fsinal.add(al1.get(j));
            j++;
        } 
         return createBst(fsinal,0,fsinal.size()-1);
    } 
    public static Node createBst(ArrayList<Integer>fsinal, int si,int ei){
        if(si>ei){
            return null;
        } 
        int mid=(si+ei)/2;
        Node node=new Node(fsinal.get(mid));
        node.left=createBst(fsinal, si, mid-1);
        node.right=createBst(fsinal, mid+1, ei);

        return node;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+"-"); 
        preorder(root.right);
    }

    public static void main(String args[]){
        Node root1=new Node(5);
        root1.right=new Node(4);
        root1.left=new Node(6); 

        Node root2=new Node(2);
        root2.left=new Node(1);
        root2.right=new Node(3); 
        Node root=Merge2Bst(root1,root2); 
        preorder(root);
    } 
}
