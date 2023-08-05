import java.util.*;
public class LargestRowCol{
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

    public static void largest(int[][] mat){
        	//Your code goes here
	    int clargest = Integer.MIN_VALUE;
        int rLargest = Integer.MIN_VALUE;
        int col=0;
        int row=0;
       
       if(mat.length!=0){
       for(int j=0;j<mat[0].length;j++){
           int sum = 0;
           for(int i=0;i<mat.length;i++){
               sum+=mat[i][j];
           }
           if(sum>clargest){
               clargest=sum;
               col=j;
           }
       }
      
      
       for(int i=0;i<mat.length;i++){
           int sum = 0;
           for(int j=0;j<mat[0].length;j++){
               sum+=mat[i][j];
           }
           if(sum>rLargest){
               rLargest=sum;
               row=i;
           }
       }
       }

       if(mat.length==0){
           System.out.println("row "+"0 "+"-2147483648");
       }else if(rLargest>=clargest){
           System.out.println("row "+row+" "+rLargest);
       }else{
           System.out.println("column "+col+" "+clargest);
       }
   }
        
    
    public static void main(String[] args){
        int[][] mat = input();
        largest(mat);
        

    }
}
