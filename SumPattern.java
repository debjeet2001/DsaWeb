import java.util.*;
public class SumPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        //Start printing the Sum pattern.
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=1;j<=i;j++){
                System.out.print(j);
                sum+=j;
                if(j+1<=i){
                    System.out.print('+');
                }else{
                    System.out.print('=');
                    System.out.print(sum);
                }
                
            }
            System.out.println();
        }
    }
}
