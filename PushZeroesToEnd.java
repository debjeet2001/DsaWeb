import java.util.*;
public class PushZeroesToEnd {
    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        for( int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>0 || arr[j] < 0){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
        
    }
    public static void main(String[] args){
        int[] arr ={5 ,0 ,7 ,4 ,8 ,1 ,3 ,0, 7 ,2 ,0 };
        pushZerosAtEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
