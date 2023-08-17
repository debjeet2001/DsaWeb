package dsa.Recursion;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		//multipliacation is repetitive addition. this logic is sufficient.
		//taking m as constant and using the value of n for recursion.
		if(n == 1)return m;

		int sum = multiplyTwoIntegers(m, n-1);
		sum += m;
		return sum;
	}
    public static void main(String[] args){
        int m =3;
        int n = 5;
        System.out.println(multiplyTwoIntegers(m, n));
    }   
}
