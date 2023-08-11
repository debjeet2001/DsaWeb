import java.util.Scanner;

public class HighestoccuringCharacter {
    public static char highestOccuringChar(String str) {
		//Your code goes here
		int[] arr = new int[256];
		int index = -1;
		for(int i = 0 ; i<str.length();i++){
			arr[str.charAt(i)]++;
		}
		int largestFrequency = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largestFrequency){
				largestFrequency=arr[i];
				index=i;

				}
		}
		char ch='0';
		for(int i=0;i<str.length();i++){
            if(str.charAt(i)==index){
                ch=str.charAt(i);
            }
        }
        return ch;
	}

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(highestOccuringChar(str));
    }
}
