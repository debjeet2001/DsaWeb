package dsa.TREES;

public class HeightOfTree {

    
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null)return 0;
		int left=0;
		int right=0;
		left=height(root.left);
		right=height(root.right);
		int maximum=Math.max(left,right);
		return 1+maximum;
	}
    
}
