import java.util.*;
public class IsoscelesTriangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n; 
        n = s.nextInt();

        //Printing the Pattern.
        for(int i=1;i<=n;i++){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int start = 1;
            while(start<=i){
                System.out.print(start);
                start++;
            }
            start--;
            while(start>1){
                start--;
                System.out.print(start);

            }
            System.out.println();
        }
    }
}
