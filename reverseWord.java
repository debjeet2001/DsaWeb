public class reverseWord {
    public static void reverseWordWise(String input) {
		// Write your code here
		String rev="";
		int start=0;
		
			for(int i=0;i<input.length();i++){
				if(input.charAt(i)==' '){
					for(int j=i-1;j>=i;j--){
						rev+=input.charAt(j);
					}
					rev+=" ";
				}
				start=i+1;
			}
			for(int i=input.length()-1;i>=start;i--){
				rev+=input.charAt(i);
			}

			System.out.print(rev);
			

		

	}
    public static void main(String[] args){
        reverseWordWise("Welcome to coding ninjas");
    }
}
