import java.util.*;

public class FindingLargestElement{
    public static void main(String[] args){
        // Creating the array.
        int n; //size of the array.
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        // Declaring the array
        int[] arr = new int[n];
        // Taking input in array.
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        //Printing the array.
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //Finding the largest element in the array.
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}