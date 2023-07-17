import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int digit;
        int nn=0;
        while(n>0){
            digit=n%10;
            n=n/10;
            nn=10*nn + 10*digit;
        }
        System.out.println(nn/10);
    }
}
