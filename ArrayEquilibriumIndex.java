public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int index = -1;
		int sum1 = 0;
		int sum2 = 0;
		//first step summing the elements from index 0 to last index;
		for(int i=0;i<arr.length;i++){
			sum2+=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(i>0 && i<arr.length){
				sum1+=arr[i-1];
				sum2-=arr[i];
				if(sum1==sum2)return i;
			}else{
				
				sum2-=arr[i];
				if(sum1==sum2)return i;
			}
		}
		return index;
	}
    public static void main(String[] args){
        int[] arr ={1, -1, 4};
        System.out.println(arrayEquilibriumIndex(arr));
    }
    
}
