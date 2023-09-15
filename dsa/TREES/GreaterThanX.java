package dsa.TREES;

public class GreaterThanX {

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if(root==null)return 0;
		int left = countNodesGreaterThanX(root.left, x);
		int right = countNodesGreaterThanX(root.right, x);
		int sum=left+right;
		if(root.data>x)sum++;

		return sum;
	}
    
}
