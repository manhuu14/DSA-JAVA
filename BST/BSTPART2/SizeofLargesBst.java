public class SizeofLargesBst { 
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }     
    public static class Info {
        boolean isBst;
        int size;
        int min;
        int max;
        public Info(boolean isBst,int size, int min, int max){
            this.isBst=isBst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }      
    public static int maxBst=0;

    public static Info isLargestBst(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        } 
        Info leftInfo=isLargestBst(root.left);
        Info rigInfo=isLargestBst(root.right);
        int size=leftInfo.size+rigInfo.size+1; 
        int min=Math.min(root.data, Math.min(leftInfo.min, rigInfo.min)); 
        int max=Math.max(root.data,Math.max(leftInfo.max, rigInfo.max));
        if(root.data<=leftInfo.max || root.data>=rigInfo.min){
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBst && rigInfo.isBst){
            maxBst=Math.max(size, maxBst);
            return new Info(true, size, min, max);
        } 
        return new Info(false, size, min, max);
    }
    public static void main(String args[]){
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        //root.left.left.left=new Node(3);

        root.right=new Node(60);
        root.right.right=new Node(70);
        root.right.left=new Node(45);
        root.right.right.right=new Node(80);
        root.right.right.left=new Node(65);
        Info info=isLargestBst(root);
        System.out.println("largest bst size"+ maxBst);
    }
}
