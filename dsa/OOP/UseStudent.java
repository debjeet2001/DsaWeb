package dsa.OOP;



public class UseStudent {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Debjeet Chakraborty";
        s1.roll = 2006;
        s2.name = "Linus Torvalds";
        s2.roll = 2009;
        System.out.println(s1.name+" "+ s1.roll);
        System.out.println(s2.name + " " + s2.roll);
        
    }    
}
