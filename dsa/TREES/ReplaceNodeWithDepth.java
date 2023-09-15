package dsa.TREES;

public class ReplaceNodeWithDepth {
    
    public static void replace(BinaryTreeNode<Integer> root, int k){
		if(root==null)return;
		root.data=k;
		replace(root.left,k+1);
		replace(root.right,k+1);
		return;
	}

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		replace(root,0);
		return;
		
	}
}
