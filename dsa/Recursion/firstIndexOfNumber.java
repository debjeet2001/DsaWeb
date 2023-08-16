package dsa.Recursion;

public class firstIndexOfNumber {
    public static int findFirstIndex(int[] input,int x, int si){
        if(si==input.length-1){
            if(input[si]==x)return si;
            else return -1;
        }
        if(input[si]==x)return si;
        int index = findFirstIndex(input, x, si+1);
        return index;
    }
    public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        return findFirstIndex(input, x,0);
		
		
	}

    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        System.out.println(firstIndex(input,5));
    }
}
