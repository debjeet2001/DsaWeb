package dsa.TREES;


public class BinaryTreeUse {

    public static void depthAtK(BinaryTreeNode<Integer> root, int k){
        if(root==null)return;
        if(k==0)System.out.println(root.data);
        depthAtK(root.left, k-1);
        depthAtK(root.right, k-1);
    } 


    public static int numLeafNodes(BinaryTreeNode<Integer> root){
        if(root==null)return 0;
        int left = numLeafNodes(root.left);
        int right = numLeafNodes(root.right);
        int count =0;
        if(root.left==null && root.right==null)count++;
        return count+left+right;
    }

    public static int largestData(BinaryTreeNode<Integer> root){
        if(root == null) return -1;
        int leftLargest = largestData(root.left);
        int rightLargest = largestData(root.right);
        return Math.max(root.data, Math.max(leftLargest,rightLargest));
        
    }

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
        depthAtK(root, 1);
    
}

    

}
