public class PairSum {
    public static int pairSum(int arr[], int x) {
    	//Your code goes here
       
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            int sum =0;
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]+arr[j]==x){
                sum+=arr[i]+arr[j];
                count++;
            }
            
        }

        return count;
    }
    public static void main(String[] args){
        int[] arr1={1, 3, 6, 2, 5, 4, 3, 2, 4};
        
        System.out.println(pairSum(arr1, 7));
    }
}
