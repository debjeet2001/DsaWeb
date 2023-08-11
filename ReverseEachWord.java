import java.util.*;
public class ReverseEachWord {
    public static String ReverseString(String str){
        int start=0;
        String ans = "";
        for(int i = 0 ;i<str.length();i++ ){
            String rev = "";
            if(str.charAt(i)==' '){
                int end = i-1;
                
                //reversing the word;
                for(int j = end ; j>= start ;j--){
                    rev = rev + str.charAt(j);
                }
                start=i+1;
                
            }
            ans +=rev + " " ;
        }
        String rev="";
        for(int i = str.length()-1 ; i>=start; i--){
            rev+=str.charAt(i);
        }
        ans += rev;


        return ans;
    }
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println(ReverseString(word));
    }
}
