import java.util.*;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        String str = "";
        int count = 0;
        //Calculating the Binary of a decimal
        if(n==0)System.out.print(0);
        while(n>0){
            if((n&1)==1){
                str+='1';
                count++;
            }else{
                str+='0';
                count++;
            }
            n=n>>1;
        }
        for(int i=count-1; i>=0 ;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        
    }
}