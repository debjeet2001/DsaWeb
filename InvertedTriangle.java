import java.util.*;
public class InvertedTriangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //Printing the Inverted Triangle.
        for(int i=n; i>=1;i--){
            for(int j=i;j>=1;j--)System.out.print("*");
            System.out.println();
        }
    }
}
