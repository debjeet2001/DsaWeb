import java.util.*;

public class TestCase {
    public static String minLengthWord(String input){
		
		// Write your code here
		String str = "";
		int small=Integer.MAX_VALUE;
		int count = 0;
		int indexSpace=-1;
		int indexStart=-1;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!=' ')count++;
			if(input.charAt(i)==' '){
				indexSpace = i;
				if(count<small){
					small=count;
					indexStart = i;
					count=0;
				}
			}
		}
		count =0;
		for(int i = indexSpace+1;i<input.length();i++){
			count++;
		}
		if(count<small){
			small=count;
		}
	
		for(int i = indexStart-small; i<i+small;i++ ){
			str+=input.charAt(i);
		} 

		return str;

	}
    public static void main(String[] args){
        String str1 = new String ("I love coding"); 
        System.out.print(minLengthWord(str1));
      
   
    }
}

