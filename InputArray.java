import java.util.*;
public class InputArray{
    public static void inputArray(int[][] arr, int row, int col){
        Scanner s = new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
    }
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 
    System.out.print("Enter no of rows :");
    int row = s.nextInt();
    System.out.print("Enter no of columns:");
    int col = s.nextInt();
    int[][] arr = new int[row][col];
    inputArray(arr,row,col);
    for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }  
    }
}