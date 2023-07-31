public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])return i+1;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 1};
        //caling the function.
        System.out.println(arrayRotateCheck(arr));
       
    }
}
