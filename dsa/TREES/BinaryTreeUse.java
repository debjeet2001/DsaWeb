package dsa.TREES;


public class BinaryTreeUse {
    public static int sumNodes(BinaryTreeNode<Integer> root){
        if(root == null)return 0;
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root == null)return 0;

        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1+leftNodeCount+rightNodeCount; 
    }

    public static void printTreeDetail(BinaryTreeNode<Integer> root){
        if(root == null)return;
        System.out.print(root.data + ":");
        if(root.left != null ){
            System.out.print("L:" + root.left.data+ " ");
        }
        if(root.right != null){
            System.out.print("R:"+root.right.data);
        }
        System.out.println();
        printTreeDetail(root.left);
        printTreeDetail(root.right);
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
        System.out.println(sumNodes(root));
    
}

    

}
