import java.util.*;
public class TermsOfAp {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int count=0;
        //Checking AP.
        for(int i=1;count<n;i++){
            if((3*i+2)%4!=0){
                count++;
                System.out.print(3*i+2+ " " );
            }
        }
    }
}
