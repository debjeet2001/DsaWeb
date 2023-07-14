import java.util.*;
public class TriangularStarPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //Printing the Triangular star pattern.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)System.out.print('*');
            System.out.println();
        }
    }
}
