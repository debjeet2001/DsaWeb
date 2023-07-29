import java.util.*;
public class SwapAlternate {
    public static void swapAlternate(int[] arr){
        if(arr.length == 1) return;

        if(arr.length%2==0){
            for(int i=0;i<arr.length;i+=2){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }else{
            for(int i=0;i<arr.length-1;i+=2){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS IN AN ARRAY : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        //input array.
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        swapAlternate(arr);
        //printing the array.
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
