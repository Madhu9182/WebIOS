package SuperKeyWord;

class Appliances{
	String mobile = "Samsung";
	String desktop = "Hp";
	String laptop = "Lenovo";
	String tv = "LG";
}
class Electronics extends Appliances{
	String mobile = "OnePlus";
	String desktop = "Dell";
	String laptop = "Acer";
	String tv = "Sony";
	
	void details()
	{
		//super keyword is used to reference the super class members
		System.out.println("Mobile is from super class : "+super.mobile);
		System.out.println("Mobile is from sub class : " + mobile);
		
		System.out.println("Desktop is from super class : " + super.desktop);
		System.out.println("Desktop is from sub class : " + desktop);
	}
}
public class Automobiles {

	public static void main(String[] args) {
		Electronics e = new Electronics();
		e.details();

	}

}
