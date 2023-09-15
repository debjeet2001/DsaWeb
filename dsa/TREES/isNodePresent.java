package dsa.TREES;

public class isNodePresent {

    public static boolean NodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root==null)return false;

		if(root.data==x)return true;

		boolean presentLeft = NodePresent(root.left, x);
		boolean presentRight = NodePresent(root.right, x);

		if(presentLeft ==true || presentRight == true)return true;
		else return false;

	}
    
}
