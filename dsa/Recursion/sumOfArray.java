public class sumOfArray{
    public static int sum(int[] arr){
        
        if(arr.length==1){
            return arr[0];
        }
        int sum = 0;
        int[] passArray = new int[arr.length-1];
        //copying the array.
        for(int i=1;i<arr.length;i++){
            passArray[i-1]=arr[i];

        }
        sum+=arr[0]+sum(passArray);
        return sum;


    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(sum(arr));
    }
}