package dsa.OOP;

public abstract class Pen {
    protected int width;
    protected String colour;
    protected final String type;

    protected abstract void getCompany();
    protected abstract void isFountain();

    protected Pen(String type){
        this.type = type;
    }

    //setters

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setColour(String colour ){
        this.colour = colour;
    }

    
}
