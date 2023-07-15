import java.util.*;
public class DiamondOfStars {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int n2 = n/2 +1;
        //printing the pattern.
        for(int i=1;i<=n2;i++){
            
            //printing the spaces.
            int space=1;
            while(space<=n2-i){
                System.out.print(" ");
                space++;
            }

            //printing the stars.
            for(int j=1;j<=i;j++)System.out.print("*");

            //printing the Stars.
            if(i==1)System.out.println();
            else{
                for(int j=1;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }

        for(int i=1; i<=n-n2;i++){
            //printing space.
            for(int j=1;j<=i;j++)System.out.print(" ");
            //printing stars.
           int star1=1;
           while(star1<=n-n2+1-i){
            System.out.print("*");
            star1++;
           }
           star1=1;
           while(star1<=n-n2-i){
            System.out.print("*");
            star1++;
           }

           System.out.println();
        }
    }
}
