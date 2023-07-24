import java.util.*;
public class LinearSearch {
    
    public static int[] input(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // Declaring the array
        int[] arr = new int[n];
        // Taking input in array.
        for(int i=0;i<n;i++){
               arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr1){
        //Printing the array.
       for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+ " ");
        }
        System.out.println();
    }
    
    public static int linearS(int[] arr , int x){
        //implementing the linear Search.
        for(int i = 0; i< arr.length; i++){
            if(x == arr[i])return i;
        }
        return -1;
    } 

    public static void main(String[] args){
       
        Scanner s = new Scanner(System.in);
        int[] arr = input();
        printArray(arr);
        int x = s.nextInt();
        System.out.println(linearS(arr, x));
    }
}
