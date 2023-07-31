public class Sort012 {
    public static void sort012(int[] arr){
    	//Your code goes here
        int zero = 0;
        int one = 0;
        int two = 0; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)zero++;
            else if(arr[i]==1)one++;
            else two++;
        }
        //inserting zero;
        for(int i=0;i<zero;i++)arr[i]=0;

        //inserting one.
        for(int i=zero;i<zero+one;i++)arr[i]=1;

        //inserting two.
        for(int i=zero+one;i<zero+one+two;i++)arr[i]=2;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 0, 2, 0, 1};
        //caling the function.
        sort012(arr);
        //printing the array.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
       
    }
}
