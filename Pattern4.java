import java.util.*;

public class Pattern4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        // printing the pattern
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--)System.out.print(j);
            System.out.println();
        }

    }
}