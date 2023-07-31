import java.util.*;

public class BinarySearch{

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(key>arr[mid]){
                start=mid+1;
            }else if(key<arr[mid]){
                end=mid-1;
            }else{
                if(key==arr[mid])return mid;
                
            }
            
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //input array
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Key --> ");
        int key = s.nextInt();
        System.out.println(binarySearch(arr,key));
         
    }
}