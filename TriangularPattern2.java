import java.util.*;
public class TriangularPattern2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,count=1;
        n = s.nextInt();
        
        //Printing the Triangular pattern.

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        
    }
}
