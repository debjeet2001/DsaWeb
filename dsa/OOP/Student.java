package dsa.OOP;

public class Student {
    String name;
    int roll;

    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
        
    }

    public void print(){
        System.out.println(this.name+" "+this.roll);
    }
    

}
