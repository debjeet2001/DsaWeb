import java.util.*;
public class LargestColSum{
    public static int[][] input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int row = s.nextInt();
        System.out.print("Enter no of Columns : ");
        int col = s.nextInt();
        int [][] mat = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = s.nextInt();
            }
        }
        return mat;
    }

    public static int largestColSum(int[][] mat){
        int largest = Integer.MIN_VALUE;
        for(int j=0;j<mat[0].length;j++){
            int sum = 0;
            for(int i=0;i<mat.length;i++){
                sum+=mat[i][j];
            }
            if(sum>largest)largest=sum;
        }
        return largest;
    }
    public static void main(String[] args){
        int[][] mat = input();
        System.out.println(largestColSum(mat));

    }
}