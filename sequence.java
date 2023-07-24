import java.util.*;



public class sequence {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		boolean decrease = false;
		// input in array.
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		
		if(arr[0]>arr[1] && arr[0]!=arr[1])decrease=true;
		
		for(int i=1;i<n-1;i++){
			if(arr[i]>arr[i+1] && arr[i]!=arr[i+1]){
				if(decrease==true){

				}
				else count ++;
				decrease=true;
			}
			else if(decrease==false){

			}else {
				count++;
				decrease=false;
			}


			
			
		}

		if(count ==1 || count == 0)System.out.println("true");
		else System.out.println("false");


	}
}
