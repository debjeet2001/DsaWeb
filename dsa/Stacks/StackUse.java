package dsa.Stacks;

public class StackUse {

    public static void main(String[] args){
        StackUsingArray stack = new StackUsingArray();
        System.out.println(stack.size());
        System.out.println(stack.isempty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.push(5);
        System.out.println(stack.size());
        System.out.println(stack.isempty());
        stack.pop();
        stack.pop();
        System.out.println(stack.size());


    }
    
}
