
import java.util.*;
public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n = output.length-1;
        int small;
        boolean arr1large=false;
        if(arr1.length>arr2.length){
            small=arr2.length-1;
            arr1large=true;

        }else {
            small = arr1.length-1;

        }
            int i=arr1.length-1;
            int j=arr2.length-1;
            while(small>=0){
                int sum = arr1[i]+arr2[j]+ output[n];
                if(sum>=10){
                    sum = sum%10;
                    output[n]=sum;
                    output[n-1]++;
                    n--;
                    small--;
                }else{
                    output[n]=arr1[i]+arr2[j]+output[n];
                    n--;
                    small--;
                }

                i--;
                j--;
            }
            if(arr1large==true){
                while(i>=0){
                    int sum = arr1[i]+output[n];
                    if(sum>=10){
                        sum=sum%10;
                        output[n]=sum;
                        output[n-1]++;
                        i--;
                        n--;

                    }else{
                        output[n]=sum;
                        i--;
                        n--;
                    }
                    
                }
            }else{
                while(j>=0){
                    int sum = arr2[j]+output[n];
                    if(sum>=10){
                        sum=sum%10;
                        output[n]=sum;
                        output[n-1]++;
                        j--;
                        n--;
                }else{
                    output[n]=sum;
                    j--;
                    n--;
                }
            }

        
        }
    }

    public static void main(String[] args) 
	{
	    Scanner sr = new Scanner(System.in);
	    int t= sr.nextInt();
	    while(t > 0)
	    {
    	    int n=sr.nextInt();
    	    int ar1[] = new int[n];
    	    for(int i=0;i<n;i++)
    	    {
    	        ar1[i] = sr.nextInt();
    	    }
    	    int m = sr.nextInt();
    	    int ar2[] = new int[m];
    	    for(int i=0;i<m;i++)
    	    {
    	        ar2[i] = sr.nextInt();
    	    }
    	    
    	    int output[] = new int[Math.max(n,m) + 1]; 
    	    sumOfTwoArrays(ar1, ar2, output);
    	    for(int i = 0 ;i < output.length ;i++)
    	    {
    	        System.out.print(output[i]+" ");
    	    }
    	    System.out.println();
    	    t = t-1;
	    }
	}
    
}
