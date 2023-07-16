import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;
public class HalfDiamond {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //will start printing the pattern.
        System.out.println("*");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1)System.out.print("*");
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1)System.out.print("*");
                System.out.print(j);
            }

            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        System.out.println("*");
    }
}
