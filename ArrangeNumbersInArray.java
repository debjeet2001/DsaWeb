import java.util.*;



public class ArrangeNumbersInArray {
    
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        
        int i=0; 
        int value = 1;
        while(value<=n){
            arr[i]=value;
            value+=2;
            i++;
        }
        i=1;
        value = 2;
        while(value<=n){
            arr[n-i]=value;
            value+=2;
            i++;
        }
    }

    public static void printArray(int[] arr1){
        //Printing the array.
       for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        arrange(arr,n);
        printArray(arr);
    }
}
