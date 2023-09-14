package dsa.TREES;

public class BinaryTreeNode<T> {
    
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    //default constructor
    public BinaryTreeNode(T data){
        this.data = data;
    }
}
