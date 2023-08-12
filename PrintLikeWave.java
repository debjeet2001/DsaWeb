public class PrintLikeWave {
    public static void wavePrint(int mat[][]){
		//Your code goes here
		if(mat.length>0){
        int row=mat.length;
		int col=mat[0].length;
		int currentCol = 0;
		//traversing upward;
		
		while(currentCol<col){
			//traversing downward.
			for(int i=0;i<row;i++){
				System.out.print(mat[i][currentCol]+" ");
			}
			currentCol++;
			//checking if another column is available. for making transition.
			if(currentCol<col){
				int transition = mat[row-1][currentCol];
				//traversing upward.
				for(int i = row-1;i>=0;i--){
					System.out.print(mat[i][currentCol]+ " ");
				}
				currentCol++;
				//Checking if another column is available for making transition.
				if(currentCol<col){

				}else return;

				
			}
		}
    }
		
	}

    public static void main(String[] args){
        int[][] arr={};
        
        wavePrint(arr);
    }
}
