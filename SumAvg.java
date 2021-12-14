package Work;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// Sum and average of first 5 natural numbers 
		
		int num, sum = 0,avg = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = scan.nextInt();
		scan.close();
		
		for(int natural = 1; natural <= num; natural++) {
			sum += natural; // formula for sum
			avg = sum/num; // formula for average
		}
		System.out.println("The sum of the natural numbers " + sum);
		System.out.println("The avg of the natural numbers " + avg);
		
	}

}
