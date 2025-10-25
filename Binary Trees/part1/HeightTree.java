public class HeightTree { 
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
    public static int HeightCount(Node root){   
        if(root==null){
            return 0;
        } 
        int left=HeightCount(root.left);
        int right=HeightCount(root.right);
        return Math.max(left, right)+1;
    } 
    public static int NodesCount(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=NodesCount(root.left);
        int rightcount=NodesCount(root.right);
        return leftcount+rightcount+1;
    } 
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
   public static void main(String args[]){
    Node root=new Node(1); 
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6); 
    root.right.right=new Node(7);
    System.out.println(HeightCount(root)); 
    System.out.println(NodesCount(root)); 
    System.out.println(sum(root));
   } 
}
