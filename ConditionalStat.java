package Work;

public class ConditionalStat {

	public static void main(String[] args) {
		int input1 = 25, input2 = 78, input3 = 87;
		
		if(input1>=input2) {
			if(input1>=input3) {
				System.out.println(input1 + " is the largest number");
			}
			else
				System.out.println(input3+ " is the largest number");
		}
		else
			if(input2>=input3){
				System.out.println(input2 + " is the largest number");		
			}
			else
				System.out.println(input3 + " is the largest number");
	}
}
