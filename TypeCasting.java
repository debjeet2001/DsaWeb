import java.util.*;

public class TypeCasting{

    public static void main(String[] args){
        char ch = 'H';
        short i =100; //compiler error, char doesnot hold negative values as short does. type casting error.
        ch = i;
        System.out.println(ch);
    }
}