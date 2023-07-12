import java.util.*;

public class FahrenheitToCelsius{

    public static void main(String[] args){
        int S,E,W;
        Scanner input = new Scanner(System.in);
        S = input.nextInt();
        E = input.nextInt();
        W = input.nextInt();

        //Checkeing constraint using if() condition.

        if( S>=0 && S<=90 && E>=S && E<=900 && W>=0 && W<=80 ){
            for(int i=S ; i<=E ; i=i+W){
                double C;
                C=((i-32)*(5.0/9));
                int intC=(int)C;
                System.out.print(i + " " + intC);
                System.out.println();
            }
        }


    }
}