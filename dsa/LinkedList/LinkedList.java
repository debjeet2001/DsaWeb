

public class LinkedList {

    public static void addNode(Node<Integer> head,int data){
        Node<Integer> temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        Node<Integer> newnode = new Node<>(data);
        

        temp.next = newnode;
        
    }

     public static int length(Node<Integer> head){
        //Your code goes here
        if(head == null) return 0;
        int count =0;
        Node<Integer> temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }
    public static void printIthNode(Node<Integer> head, int i){
        int count = 0;
		Node<Integer> temp = head;

		if(head == null)return;

		while(temp != null){
			
			if(count == i){
				System.out.println(temp.data);
				return ;
			}

			count++;
			temp = temp.next;
		}

		
    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		Node<Integer> temp = new Node<>(data);
		if(head == null){
			head = temp;
			return head;
		}

		//inserting data at 0 position.
		if(pos ==0){
			temp.next = head;
			return temp;
		}

		int count = 0;
		Node<Integer> node = head;
		while(count < pos-1){
			node = node.next;
            if(node == null) return head;
			
			count++;
		}

		temp.next = node.next;
		node.next = temp;

		return head;
	}

    public static void printNode(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        Node<Integer> head = new Node<>(10);
        
        addNode(head, 20);
        addNode(head, 30);
        addNode(head,40);
        addNode(head,50);
        addNode(head, 100);

        //printNode(head);
        //System.out.println(length(head));
        //printIthNode(head, 4);
        
        head = insert(head, 6, 70);
        printNode(head);

    }
}
