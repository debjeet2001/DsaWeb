import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swapping
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        //input array.
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        bubbleSort(arr);
        //printing the array.
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        } 
    }
}
