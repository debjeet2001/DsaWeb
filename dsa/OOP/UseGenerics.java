public class UseGenerics {

    public static void main(String[] args){
        generics g = new generics(20,10);
        System.out.println(g.gettersfirst());
        System.out.println(g.getterssecond());
        g.setters(30, 20);
        System.out.println(g.gettersfirst());
        System.out.println(g.getterssecond());

        generics h = new generics("debjeet","Chakraborty");
        System.out.println(h.gettersfirst());
        System.out.println(h.getterssecond());


    }
    
}
