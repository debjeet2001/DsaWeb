import java.util.*;
public class SecondLargestInArray {
    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        //first trying to sort the array.
        Arrays.sort(arr);
        //reversing the array.
        int s = 0; 
        int e = arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        //usinf iteration to find largest .
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[0])return arr[i];
        }
        return arr[0];
    }
    public static void main(String[] args){
        int[] arr = {4, 3, 10, 9, 2};
        //caling the function.
        System.out.println(secondLargestElement(arr));
       
    }
}
