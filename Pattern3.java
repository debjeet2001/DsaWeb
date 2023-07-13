import java.util.*;

public class Pattern3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        // printing the pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)System.out.print(j);
            System.out.println();
        }

    }
}