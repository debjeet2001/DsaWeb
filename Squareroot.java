import java.util.*;
public class Squareroot {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        int count =0;
        n = s.nextInt();
        for(int i=0;i*i<=n;i++){
            count = i;
        }
        System.out.println(count);
        
    }
}
