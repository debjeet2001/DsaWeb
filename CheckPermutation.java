///This method is not 100% correct. but i tried the logic anyway :-)
import java.util.*;
public class CheckPermutation {
    public static boolean isPermutaion(String str1, String str2 ){
        boolean ans=false;
        int sum1=0;
        int sum2=0;
        //calculating the ASCI sum of the string 1.
        for(int i=0;i<str1.length();i++){
            sum1+=str1.charAt(i);
        }
        //calculating the ASCI sum of the string 2.
        for(int i=0;i<str2.length();i++){
            sum2+=str2.charAt(i);
        }
        if(sum1==sum2)return true;

        return ans;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(isPermutaion(str1,str2));
    }
}
