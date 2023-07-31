import java.util.*;
public class Merge {
    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int n =arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[m+n];
        //filling arr1 into arr3.
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        //filling arr2 into arr3
        int start=0;
        for(int i=n;i<m+n;i++){
            arr3[i]=arr2[start];
            start++;

        }
        Arrays.sort(arr3);
        return arr3;
    }
    public static void main(String[] args){
        int[] arr1 ={1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int[] arr3 = merge(arr1, arr2);
        //printing the array.
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }
    }
}
