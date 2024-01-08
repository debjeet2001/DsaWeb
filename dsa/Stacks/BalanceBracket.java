package dsa.Stacks;
import java.util.*;
public class BalanceBracket {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> s = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        if(expression.charAt(0)==')' || expression.charAt(0)=='}' || expression.charAt(0)==']'){
            return false;
        }
        for(int i =0 ; i<expression.length();i++){
            if(expression.charAt(i)=='(' || expression.charAt(i)=='{' || expression.charAt(i)=='['){
                s.push(expression.charAt(i));
            }
        }

        for(int i =0 ; i<expression.length();i++){
            if(expression.charAt(i)==')' || expression.charAt(i)=='}' || expression.charAt(i)==']'){
                s2.push(expression.charAt(i));
            }
        }

        

        for(int i=0;i<expression.length();i++){
           
           if(expression.charAt(i)==')' && s.peek()=='(' ){
               s.pop();
               s2.pop();
           }else if(expression.charAt(i)=='}' && s.peek()=='{'){
               s.pop();
               s2.pop();
           }else if(expression.charAt(i)==']' && s.peek()=='['){
               s.pop();
               s2.pop();
           }
        }
        if(s.size()==0 && s2.size()==0)return true;
        else return false;
    }
}