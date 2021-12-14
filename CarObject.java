package Work;

public class CarObject {
	long price;
	String brand;
	String model;
	String color;
	
	public CarObject(long price,String brand,String model,String color) {
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	void CarDetails() {
		System.out.println("Car price is " + price);
		System.out.println("Car brand is " + brand);
		System.out.println("Car model is " + model);
		System.out.println("Car color is " + color);
	}

	public static void main(String[] args) {
		//Creating Object
		CarObject car = new CarObject(500000, "Lamborgini","Aventador","black");
		CarObject cars = new CarObject(805000, "BMW","BMW series 5","black Matte");
		CarObject c = new CarObject(582000, "Lamborgini","Aventador","black");
		
		car.CarDetails();
		System.out.println("====================================");
		cars.CarDetails();
		System.out.println("====================================");
		c.CarDetails();
	}
	

}
