package dsa.Recursion;

public class CountZeroes {
    public static int count(int input){
		if(input==0)return 0;

		int sum = count(input/10);

		if(input%10==0)sum+=1;

		return sum;
	}
	public static int countZerosRec(int input){
		// Write your code here
		if(input==0)return 1;
		else return count(input);
		



	}
    public static void main(String[] args){
        int n =10204;
        System.out.println(countZerosRec(n));
    }
    
}
