import java.util.*;
public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        char previous =str.charAt(0); 
        String ans="";
        ans+=previous;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=previous){
                ans+=str.charAt(i);
                previous=str.charAt(i);
            }
        }
        return ans;
	}

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine() ;
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
