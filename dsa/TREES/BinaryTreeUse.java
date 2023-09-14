package dsa.TREES;


public class BinaryTreeUse {
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
    printTree(root);
    
}

    

}
