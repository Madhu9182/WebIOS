package Work;

public class MobileObject {
	int price;
	String brand;
	String model;
	int processor;
	
	public MobileObject(int price, String brand, String model, int processor) {
		super();
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
	}
	void MobileDetails() {
		System.out.println("Mobile price is "+price);
		System.out.println("Mobile brand is "+brand);
		System.out.println("Mobile model is "+model);
		System.out.println("Mobile processor is "+processor);
	} 

	public static void main(String[] args) {
		MobileObject obj = new MobileObject(13000,"OnePlus","Nord 5G",765);
		MobileObject object = new MobileObject(13000,"OnePlus","7T",880);
		MobileObject Obj = new MobileObject(13000,"OnePlus","Nord2 5G",780);
		
		obj.MobileDetails();
		System.out.println("===============================");
		object.MobileDetails();
		System.out.println("===============================");
		Obj.MobileDetails();
	}

}
