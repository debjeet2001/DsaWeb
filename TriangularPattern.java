import java.util.*;
public class TriangularPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //Printing the Triangular Pattern.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)System.out.print(j+" ");
            System.out.println();
        }
    }
}
