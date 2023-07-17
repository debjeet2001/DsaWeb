import java.util.*;
public class OddSquare {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //printing Odd Square
        for(int i=1;i<n*2;i+=2){
            for(int j=i;j<n*2;j+=2){
                System.out.print(j);
            }
            int sum=1;
            while(sum<i){
                System.out.print(sum);
                sum+=2;
            }
            System.out.println();
        }
    }

}
