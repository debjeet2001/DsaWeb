
public class RotateArray {

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        //reversing the first part till d.
        int start = 0;
        int end = d-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        //first part of reverse completes.
        // second reverse.
        start = d;
        end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        //finally reversing the whole array.
        start = 0;
        end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr,2);
        //printing the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println();
    }
    
}
