import java.util.*;
public class TriangleOfNumbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int var=2;
        n = s.nextInt();
        
        //printing the pattern.
        for(int i=1;i<=n;i++){
            int space = 1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int pvar=i;
            for(int j=1;j<=i;j++){
                System.out.print(pvar);
                pvar++;
            }
            if(i==1)System.out.println();
            else{
                for(int j=1;j<i;j++){
                    System.out.print(var);
                    var--;
                }
                var++;
                var=var*2;
                System.out.println();
            }
            
        }     
    }
}