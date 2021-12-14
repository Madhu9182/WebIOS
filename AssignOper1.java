package Work;
import java.util.Scanner;
public class AssignOper1 {

	public static void main(String[] args) {
		int num, number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num : ");
		num = scan.nextInt();
		
		num += 32;
		System.out.println("After using += Assignment Operator " + num);
		
		num -= 32;
		System.out.println("After using -= Assignment Operator " + num);
		
		num *= 32;
		System.out.println("After using *= Assignment Operator " + num);
		
		num /= 32;
		System.out.println("After using /= Assignment Operator " + num);
		
		num %= 32;
		System.out.println("After using %= Assignment Operator " + num);
		
		System.out.println("Enter the number : ");
		number = scan.nextInt();

		number += 21;
		System.out.println("After using += Assignment Operator " + number);
		
		number -= 98;
		System.out.println("After using -= Assignment Operator " + number);
		
		number *= 43;
		System.out.println("After using *= Assignment Operator " + number);
		
		number /= 9;
		System.out.println("After using /= Assignment Operator " + number);
		
		number %= 22;
		System.out.println("After using %= Assignment Operator " + number);
		
		scan.close();
		
	}

}
