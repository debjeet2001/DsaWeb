import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        int sum =0;
        n = s.nextInt();
        for(int i=1; n>0; i=i*2){
            int digit = n % 10;
            n = n/10;
            if(digit == 1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
