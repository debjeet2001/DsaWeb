package dsa.Recursion;

public class LastIndex {
    
    public static int findlastIndex(int[] input, int x, int startIndex,int lastIndex ){
		if(startIndex==input.length-1){
			if(input[startIndex]==x){
				return startIndex;
				
			}else return lastIndex;
		}
		if(input[startIndex]==x){
			lastIndex=startIndex;
			
		}

		int index = findlastIndex(input, x, startIndex+1, lastIndex);
		return index;
	}
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int lastIndex=-1;
		int startIndex=0;
		return findlastIndex(input,x,startIndex,lastIndex);
	}

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3};
        System.out.println(lastIndex(arr,3));
    }
}
