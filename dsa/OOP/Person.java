package dsa.OOP;

public class Person {

    String name;
    int age;
    static int numPerson;

    Person(String name, int age){
        this.name = name;
        this.age = age;
        numPerson++;
    }

    void print(){
        System.out.println(this.name+" "+this.age+" "+numPerson);
        
    }

    static int getNumPerson(){
        return numPerson;
    }


    
}
