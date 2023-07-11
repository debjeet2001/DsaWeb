import java.util.*;

public class UpperLower{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str;
        str=input.next();
        char ch = str.charAt(0);

        if(ch >=65 && ch<=90){
            System.out.println(1);
        }
        else if(ch >=97 && ch<=122){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}