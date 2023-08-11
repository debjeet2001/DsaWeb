import java.util.*;
public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=ch){
				ans+=str.charAt(i);
			}
		}
		return ans;
	}

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str1 = s.nextLine();
        char ch = str1.charAt(0);
        System.out.println(removeAllOccurrencesOfChar(str, ch));
    }
}
