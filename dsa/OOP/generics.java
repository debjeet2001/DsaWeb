public class generics<T>{
    private T first;
    private T second;

    public generics(T first, T second){
        this.first = first;
        this.second = second;
    }

    protected void setters(T first , T second){
        this.first = first;
        this.second = second;
    }

    protected T gettersfirst(){
        return this.first;
    }

    protected T getterssecond(){
        return this.second;
    }
}