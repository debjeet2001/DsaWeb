import java.util.*;
public class SelectionSort {
    public static void selSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            int temp;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[small])small=j;
            }
            temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;


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
        selSort(arr);
        //printing the array.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
