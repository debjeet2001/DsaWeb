import java.util.*;
public class NumberStarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		// Write your code here		
		for(int i = n; i>=1; i--){
			// printing the first pattern.
			for(int j = 1; j<=i;j++){
				System.out.print(j);
			}
			//printitng the 2nd pattern.
			int c = (n*2)-(i*2); 
			if(i!=n){
				for(int j=1;j<=c;j++)System.out.print("*");
			}
			//printing the 3rd pattern
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
