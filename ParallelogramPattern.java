import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //printing the Parallelogram pattern.
        for(int i=1;i<=n;i++){
            int space = i-1;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
