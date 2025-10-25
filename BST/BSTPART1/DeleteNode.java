public class DeleteNode { 
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    } 
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        } 
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        } 
        return root;
    } 
    // to delete nodes we have 3 types 
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left, val);
        }else if(root.data<val){
            root.right=delete(root.right, val);
        }  
        else{ 
            //case1 lear node
            if(root.left==null && root.right==null){
                return null;
            }  
            //case2-single node 
            if(root.left==null){
                return root.right;
            } 

            if(root.right==null){
                return root.left;
            } 
            //case3-both children 
            Node is=findInorder(root.right);
            root.data=is.data;
            root.right=delete(root.right, is.data);
        }
        return root;
    } 
    public static Node findInorder(Node root){
        while (root.left!=null) {
            root=root.left;
        } 
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        } 
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void main(String args[]){
        int values[]={5,13,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        } 
        System.out.println(delete(root, 4)); 
       inorder(root);
        
    }
}
