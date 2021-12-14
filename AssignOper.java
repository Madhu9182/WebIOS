package Work;

public class AssignOper {

	public static void main(String[] args) {
		int num = 43;
		System.out.println("Before using = Assignment operator " + num);
// Test case-1 :
		num += 32;
		System.out.println("After using += Assignment Operator " + num);
		
		num -= 32;
		System.out.println("After using -= Assignment Operator " +num);
		
		num *= 32;
		System.out.println("After using *= Assignment Operator " +num);
		
		num /= 32;
		System.out.println("After using /= Assignment Operator " +num);
		
		num %= 32;
		System.out.println("After using %= Assignment Operator " +num);
// Test Case-2:
		num +=21;
		System.out.println("After using += Assignment Operator " +num);
		
		num -= 98;
		System.out.println("After using -= Assignment Operator " +num);
		
		num *= 98;
		System.out.println("After using *= Assignment Operator " +num);
		
		num /= 9;
		System.out.println("After using /= Assignment Operator " +num);
		
		num %= 22;
		System.out.println("After using %= Assignment Operator " +num);
	}

}
