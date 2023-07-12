import java.util.*;

public class TotalSalary{

    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        int basic = s.nextInt();
        String str = s.next();
        char allow = str.charAt(0);
        double salaryFloat=0;
        
        //Calculating the Total Salary.
        if(basic >=0 && basic<=7500000 && allow>=65 && allow<=90){
            
            
            salaryFloat+=basic; //basic
            salaryFloat+=(0.2*basic); //hra
            salaryFloat+=(0.5*basic); //da
            salaryFloat-=(0.11*basic); //pf

            if(allow =='A'){
                salaryFloat+=1700;
            }else if(allow == 'B'){
                salaryFloat+=1500;
            }else{
                salaryFloat+=1300;
            }
            //Implementing the Roundoff Algorithm
            double decimal=salaryFloat*100;
            decimal=decimal%100;
            if(decimal>50)
            {
                salaryFloat+=1;
                System.out.println((int)salaryFloat);
            }
            else System.out.println((int)(salaryFloat));
    
        }
        
        
    }
}