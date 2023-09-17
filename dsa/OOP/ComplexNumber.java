package dsa.OOP;

/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumber {
	// Complete this class
	int a;
	int b;

	public ComplexNumber(int a, int b){
		this.a=a;
		this.b=b;
	}

	public void plus(ComplexNumber c){
		this.a = this.a + c.a;
		this.b = this.b + c.b;
	}

	public void multiply(ComplexNumber c){
		int a = this.a;
		int b = this.b;
		this.a = ((a*c.a) -(b*c.b) );
		this.b = ((a*c.b)+ (b*c.a)); 
	}

	public void print(){
		System.out.println(this.a+" "+"+"+" i"+this.b);
	}
	
}

