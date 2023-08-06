public class CountWords {
    public static int countWords(String str) {	
		//Your code goes here
		int count =0;
		for(int i=0; i<str.length() ;i++){
			if(str.charAt(i)==' ')count++;
		}
		return count+1;
	}
    public static void main(String[] args){
        String str = "Coding Ninjas";
        System.out.println(countWords(str));
    }    
}
