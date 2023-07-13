import java.util.*;
public class SquarePattern {
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        //Printing the square Pattern.

        if(n>=0 && n<=50)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)System.out.print(n);
                System.out.println();
            }
        }
    }
}
