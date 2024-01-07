package dsa.Stacks;

public class StackUsingArray {
    private int[] data ;
    private int pointer = 0;

    public StackUsingArray(){
        data = new int[10];
    }

    public void push(int element){
        if(pointer<10){
            this.data[pointer]=element;
            pointer++;
            return;
        }else System.out.println("Stack is full ! ");
    }

    public void pop(){
        if(pointer==0)
        {
            System.out.println("Stack is already empty ");
            return;
        }

        pointer--;
        return;

    }

    public int top(){
        return data[pointer];
    }

    public int size(){
        return pointer;
    }

    public boolean isempty(){
        if(pointer==0)return true;
        else return false;
    }

    public void printStack(){
        for(int i = 0;i<pointer;i++){
            System.out.println(data[i]);
        }
    }
}
