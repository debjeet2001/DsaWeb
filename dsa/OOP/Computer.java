package dsa.OOP;

public class Computer {
    private int ram;
    private int capacity;
    private String processor;

    Computer(int ram, int capacity,String processor){
        this.ram = ram;
        this.capacity = capacity;
        this.processor = processor;

    }

    void print(){
        System.out.println(this.ram+"GB "+this.capacity+"GB "+this.processor);
    }
}
