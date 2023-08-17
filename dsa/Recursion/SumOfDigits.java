package dsa.Recursion;

public class SumOfDigits {
    public static int sumOfDigits(int input){
		// Write your code here
		if(input==0)return 0;

		int sum = sumOfDigits(input/10);
		sum += input%10;
		return sum;


	}
    public static void main(String[] args){
        int n = 12345;
        System.out.println(sumOfDigits(n));
    }
    
}
