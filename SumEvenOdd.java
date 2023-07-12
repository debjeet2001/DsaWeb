import java.util.*;

public class SumEvenOdd{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,digit;
        int even,odd;
        even=0;
        odd=0;
        n = s.nextInt();
        if(n>=0 && n<=100000000){
            while(n>0){
                digit=n%10;
                n=n/10;
                if(digit%2==0){
                    even+=digit;
                }else odd+=digit;
            }
            System.out.println(even + " " + odd);
        }
    }
}