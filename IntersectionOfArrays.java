public class IntersectionOfArrays {
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=-999990;
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr1={2,6,1,2};
        int[] arr2={1,2,3,4,2};
        intersections(arr1, arr2);
    }
}
