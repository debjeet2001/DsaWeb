import java.util.*;
public class CharacterPattern3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        char ch1 ='A';
        //printing the pattern
        for(int i=1;i<=n;i++){
            char ch2=ch1;
            for(int j=1;j<=i;j++){
                System.out.print(ch2);
                ch2++;
            }
            System.out.println();
            ch1++;
        }
    }
}
