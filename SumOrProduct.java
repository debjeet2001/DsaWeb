import java.util.*;
public class SumOrProduct {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n,c;
        n = s.nextInt();
        c = s.nextInt();
        int sum_Or_Product=1;
        //calculating sum or product.
        if(c==1){
            for(int i=2;i<=n;i++){
                sum_Or_Product+=i;
            }
            System.out.println(sum_Or_Product);
        }else if(c==2){
            for(int i = 2 ; i<=n; i++){
                sum_Or_Product*=i;
            }
            System.out.println(sum_Or_Product);
        }else{
            System.out.println(-1);
        }

    }
}
