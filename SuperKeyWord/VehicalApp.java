package SuperKeyWord;

	/*when an object of derived class is created its default constructor of the parent get called
	 *if in case the parent class does not contain a default constructor then its the duty of the 
	 *child class to invoke the parent class constructor explicitly 
	 *To do so the "super" keyword is used
	 *super keyword must be the very first statement within the parameterized constructor*/
class Vehicle{
	//Declaring variables;
	String car_name;
	String model;
	String color;
	//Creating constructor using "generate constructor using fields"
	Vehicle(String car_name, String model, String color){
		this.car_name = car_name;
		this.model = model;
		this.color = color;
	}
	//creating method for class vehicle
	void vehicleDetails() {
		System.out.println("Car name is : " + car_name);
		System.out.println("Car model is : " + model);
		System.out.println("car color is : " + color);
	}
}
class Car extends Vehicle{
	//Declaring sub class variable
	long car_price;
	public Car(String car_name, String model, String color, long car_price){
		/*Implicit super constructor Vehicle() is undefined. Must explicitly invoke another constructor
		 * calling super calling statement
		 * we don't need to initialize again for the constructor
		 * calling one class constructor in another class constructor*/
		super(car_name,model,color);
		this.car_price = car_price;
	}
	void Cardetails() {
		System.out.println("Car price is " + car_price);
	}
}
public class VehicalApp {
	public static void main(String[] args) {
		Car obj = new Car("AUDI","ADUI S8","BLACK",8200000);
		obj.vehicleDetails();
		obj.Cardetails();
	}

}
