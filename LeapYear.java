package Work;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year : ");
		year = scan.nextInt();
		scan.close();
		boolean leap =false;
		
		if(year%4 == 0) 
		{
			if(year%100 == 0) 
			{
				if(year%400 == 0) 
					leap = true;
				else
					leap = false;
			}
			leap = true;
		}
		else
		{
			leap = false;
		}
		if(leap == true)
			System.out.println("The year " + year + " is a leap year");
		else
			System.out.println("The year " + year + " is not a leap year");
	}
}
