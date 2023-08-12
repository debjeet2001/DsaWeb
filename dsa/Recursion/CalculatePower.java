package dsa.Recursion;

import java.util.Scanner;

public class CalculatePower {
    public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(n==0)return 1;
		 int smallOutput=power(x,n-1);
		 
		 int LargeOutput=x*smallOutput;

		 return LargeOutput;
		
	}

    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        int x = s.nextInt();
        int n = s. nextInt();
        System.out.println(power(x,n));
    }
}
