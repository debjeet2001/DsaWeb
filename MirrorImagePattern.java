import java.util.*;
public class MirrorImagePattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //printing the pattern.
        for(int i=1;i<=n;i++){
            int space=1;
            while(space<= n-i ){
                System.out.print(" ");
                space++;
            }
            int star=1;
            while(star<=i){
                System.out.print("*");
                star++;
            }
            System.out.println();            
        }
    }
}
