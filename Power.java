import java.util.*;

public class Power{

    public static void main(String[] args){
        int x,n;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        n = s.nextInt();
        int product=1;

        if(x>=0 && x<=8 && n>=0 && n<=9){
            for(int i=1;i<=n;i++){
                product*=x;
            }
            System.out.println(product);
        }
     }
}