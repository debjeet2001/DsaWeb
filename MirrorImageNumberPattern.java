import java.util.*;
public class MirrorImageNumberPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        //printing Pattern.

        for(int i=1;i<=n;i++){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int start=1;
            while(start<=i){
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }
}
