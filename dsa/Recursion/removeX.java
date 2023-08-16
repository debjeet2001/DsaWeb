package dsa.Recursion;

public class removeX {
    public static String removeX(String input){
		// Write your code here
		if(input.length()==0){
			return input;
		}
		String str = removeX(input.substring(1));
		if(input.charAt(0)=='x'){

		}else {
			str = input.charAt(0)+str; 
		}
		return str;

	}
    public static void main(String[] args){
        String input = "axe";
        System.out.println(removeX(input));
    }
}
