import java.util.Scanner;

public class AverageMarks{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char name = str.charAt(0);
		int m1,m2,m3;
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();

                if(m1>=0 && m1<=100 &&  m2>=0 && m2<=100 && m3>=0 && m3<=100)
				{
                  int average = (m1 + m2 + m3) / 3;

                  System.out.println(name);
                  System.out.println(average);
                }
        }
}