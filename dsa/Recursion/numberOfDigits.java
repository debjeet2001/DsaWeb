package dsa.Recursion;
import java.util.*;
public class numberOfDigits {
    public static int countDigits(int n){
        // Write your code here.
        if(n==0)return 0;

        int smallOutput=countDigits(n/10);
        int largeOutput=1+smallOutput;
        return largeOutput;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countDigits(n));
    }
}
