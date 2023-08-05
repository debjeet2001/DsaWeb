import java.util.*;
public class SumBoundariesDiagonals{
    public static void totalSum(int[][] mat) {
		//Your code goes here
		//1st summing up the two horizontal borders i.e top and bottom.
		int sum =0;
		if(mat.length!=0){
		for(int i=0;i<mat[0].length;i++){
			sum+=mat[0][i];
		}

		for(int i=0;i<mat[0].length;i++){
			sum+=mat[mat.length-1][i];
		}

		//summing up the two vertical borders i.e left and right.
		for(int i=1;i<mat.length-1;i++){
			sum+=mat[i][0];
		}
		for(int i=1;i<mat.length-1;i++){
			sum+=mat[i][mat.length-1];
		}

		//summing up the diagonals element 
		for(int i=1;i<mat.length-1;i++){
			sum+=mat[i][i];
		}
		int count = mat.length-2;
		for(int i=1;i<mat.length-1;i++){
			if(i!=count){

			sum+=mat[i][count];
			
			}
			count--;
		}
		}
		System.out.println(sum);

	}

    public static void main(String args[]) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            totalSum(ar);
            System.out.println();
        }
    }
}