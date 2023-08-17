package dsa.Recursion;

public class GeometricSum {
    


	public static double findGeometricSum(int k){
		// Write your code here
		if(k==0){
			return 1.0;
		}

		double output = findGeometricSum(k-1);
		double sum = output + 1/Math.pow(2 ,k);
		return sum;

		

	}
}


