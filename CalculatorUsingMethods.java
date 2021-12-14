package Work;
// Method with creating object
public class CalculatorUsingMethods {
	
	public static int add(int x, int y) {
		int add;
		add = x+y;
		return add;
	}
	public void sub(int x, int y) {
		int sub;
		sub = x-y;
		System.out.println("Substraction is : " + sub);
	}
	public void mul(int x, int y) {
		int mul;
		mul = x*y;
		System.out.println("Multiplication is : " + mul);
	}
	public void div(int x, int y) {
		double div;
		div = x/y;
		System.out.println("Division is : " + div);
	}
	
	
	public static void main(String[] args) {
		int a = 7, b = 3;
		CalculatorUsingMethods c = new CalculatorUsingMethods();
		
		System.out.println("Addition is : " + add(a,b));
		c.sub(a,b);
		c.mul(a,b);
		c.div(a,b);
		
		
	}

}
