import java.util.*;
public class NthFibonacciNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int sumI=0;
        //Printing the pattern.
        if(n==1 || n==2)System.out.println(1);
        else{
            int sumI_1 = 1;
            int sumI_2 = 1;
            
            for(int i=3;i<=n;i++){
                sumI = sumI_1 +sumI_2;
                sumI_2 = sumI_1;
                sumI_1 = sumI;
            }
            System.out.println(sumI);
        }
    }
}
