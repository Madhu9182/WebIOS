package Work;
import java.util.Scanner;
public class MultiplyOne {

	public static void main(String[] args) {
		int num_one, num_two, result;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value : ");
		num_one = scan.nextInt();
		
		System.out.println("Enter second value : ");
		num_two = scan.nextInt();
		scan.close();
		
		result = num_one * num_two;
		System.out.println(result);

	}

}
