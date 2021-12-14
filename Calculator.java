package Work;
// Method without creating object
public class Calculator {
	public static void add(int x, int y) {
		int add;
		add = x+y;
		System.out.println("Addition is : " + add);
	}
	static int sub(int x, int y) {
		int sub;
		sub = x-y;
		return sub;
	}
	static int mul(int x, int y) {
		int mul;
		mul = x*y;
		return mul;
	}
	static void div(int x, int y) {
		double div;
		div = x/y;
		System.out.println("Division is : " + div);
	}

	public static void main(String[] args) {
		int a=10, b=52;
		add(a,b);
		System.out.println("Substaction is : " + sub(a,b));
		System.out.println("Multiplication is : " + mul(a,b));
		div(a,b);

	}

}
