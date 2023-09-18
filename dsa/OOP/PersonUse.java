package dsa.OOP;

public class PersonUse {
    public static void main(String[] args){
        System.out.println(Person.getNumPerson());
        Person p1 = new Person("debjeet", 23);
        p1.print();
        Person p2 = new Person("RADHA", 23);
        p1.print();
        p2.print();
        System.out.println(Person.getNumPerson());
        System.out.println(p1+" "+p2+" ");
        
    }
    
    
}
