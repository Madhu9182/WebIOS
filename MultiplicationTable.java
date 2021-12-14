package Work;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}

	}

}
