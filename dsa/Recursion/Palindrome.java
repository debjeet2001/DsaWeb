package dsa.Recursion;
public class Palindrome {
    public static String reverse(String str){
        if(str.length()==1)return str;
        String rev = reverse(str.substring(1));
        return rev + str.charAt(0);

    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        String rev = reverse(str);
        if(rev.equals(str))return true;
        else return false;
    }

    public static void main(String[] args){
        String str = "abba";
        System.out.println(isPalindrome(str));
    }
}