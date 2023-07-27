import java.util.*;
public class printPair {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i ;j<n;j++){
                System.out.print("("+ arr[i] + "," + arr[j] + ")" );
            }
            System.out.println();

        }
    }
}
