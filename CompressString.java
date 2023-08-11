import java.util.*;
public class CompressString {
    public static String Compress(String str){
        char previous = str.charAt(0);
        int count = 0;
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==previous){
                count++;
            }else if(count>1){
                    
                    ans=ans+previous+count;
                    previous = str.charAt(i);
                    count = 1;
                }else{
                    ans=ans+previous;
                    count = 1;
                    previous = str.charAt(i);
                }
            
        }
        if(count>1){
            ans= ans + str.charAt(str.length()-1) + count;
        }else{
        ans += str.charAt(str.length()-1);}

        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(Compress(str));
    }
}
