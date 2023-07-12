import java.util.*;

public class MultiplicationTable{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        if(n>=0 && n<=10000){
            for(int i=1;i<=10;i++){
                System.out.println(n*i);
            }
        }

    }
}