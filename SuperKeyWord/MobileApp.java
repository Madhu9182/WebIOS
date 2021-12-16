package SuperKeyWord;
class Mobile{
	String mobile = "OnePlus";
	String processor = "Snapdragon";
	String rom = "128GB Ram";
}
class Mob extends Mobile{
	String mobile = "Iphone";
	String processor = "AI Chip";
	String rom = "256";
	
	void details() {
		// super keyword is used to reference the super class members 
		System.out.println("Mobile name is(from parent class) : " + super.mobile);
		System.out.println("Mobile name is from child class : " + mobile);
	}
}
public class MobileApp {
	public static void main(String[] args) {
		// creating object for subclass
		Mob ref = new Mob(); 
		ref.details();
	}

}
