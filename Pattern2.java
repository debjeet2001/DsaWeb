import java.util.*;

public class Pattern2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        // printing the pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)System.out.print(i);
            System.out.println();
        }

    }
}