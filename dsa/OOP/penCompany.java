package dsa.OOP;

public abstract class penCompany extends Pen {
    protected void getCompany(){
        System.out.println("LINC");
    }

    protected penCompany(String type){
        super(type);
    }
}
