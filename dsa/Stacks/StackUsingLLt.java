package dsa.Stacks;
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class StackUsingLLt {

    //Define the data members
    private Node head;
    private int size;


    public StackUsingLLt() {
        //Implement the Constructor
        this.head = null;
        this.size = 0;

    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if(size==0)return -1;
        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public int top() {
        //Implement the top() function
        if(size == 0)return -1;
        return head.data;
    }
}