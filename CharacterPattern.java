import java.util.*;
public class CharacterPattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        
        n = s.nextInt();
        //printing the pattern;
        for(int i=1;i<=n;i++){
            char ch = 65;
            for(int j=1;j<=n;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }  
    }
}
