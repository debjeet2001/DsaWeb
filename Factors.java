import java.util.*;

public class Factors{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        int count = 0;
        n = s.nextInt();
        if(n>=0 && n<=10000){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                    if(i>1 && i < n)System.out.print(i+" ");
                }
            }
            if(count==2)System.out.println(-1);
            System.out.println();
            
        }
    }
}