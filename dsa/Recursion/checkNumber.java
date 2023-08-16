package dsa.Recursion;

public class checkNumber {
    public static boolean checkKey(int arr[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(arr[0]==x)return true;
        
        if(arr.length==1 ){
            if(arr[0]==x)return true;
            else return false;
        }

        int[] passArray= new int[arr.length-1];
        boolean ans;
        for(int i=1;i<arr.length;i++){
            passArray[i-1]=arr[i];
        }
        ans=checkKey(passArray, x);
        return ans;


        



		
	}
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(checkKey(arr,6));
    }
}
