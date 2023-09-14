package dsa.TREES;


public class BinaryTreeUse {

    public static void printTree2(BinaryTreeNode<Integer> root){
        if(root == null)return;
        System.out.print(root.data + ":");
        if(root.left != null ){
            System.out.print("L:" + root.left.data+ " ");
        }
        if(root.right != null){
            System.out.print("R:"+root.right.data);
        }
        System.out.println();
        printTree2(root.left);
        printTree2(root.right);
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null)return;
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
}
    public static void main(String[] args){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        root.left = rootLeft;
        BinaryTreeNode<Integer>  rootRight = new BinaryTreeNode<Integer>(3);
        root.right = rootRight;
        printTree2(root);
    
}

    

}
