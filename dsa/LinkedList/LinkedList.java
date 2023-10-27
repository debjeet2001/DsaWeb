

public class LinkedList {

    public static void addNode(node head,int data){
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        node newnode = new node(data);
        

        temp.next = newnode;
        
    }

     public static int length(node head){
        //Your code goes here
        if(head == null) return 0;
        int count =0;
        node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void printNode(node head){
        node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        node head = new node(10);
        
        addNode(head, 20);
        addNode(head, 30);
        addNode(head,40);
        addNode(head,50);
        addNode(head, 100);

        //printNode(head);
        System.out.println(length(head));

    }
}
