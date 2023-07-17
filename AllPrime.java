import java.util.*;
public class AllPrime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //Calculating the prime numbers from 2 to <=n
        if(n==1)System.out.println(1);
        else{
            for(int i=2;i<=n;i++){
                int count =0;
                for(int j=1;j<=i;j++){
                    if(i%j==0)count++;
                }
                if(count==2)System.out.println(i);
            }
        }
    }
}
