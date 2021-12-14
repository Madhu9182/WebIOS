package Work;

public class Annabelle {
	String name;
	String sound;
	int noOfDevils;
	
	public Annabelle(String name, String sound, int noOfDevils) {
		super();
		this.name = name;
		this.sound = sound;
		this.noOfDevils = noOfDevils;
	}
	void AnnabelleDetails() {
		System.out.println("Annabelle Name : " + name);
		System.out.println("Annabelle Sound : " + sound);
		System.out.println("Annabelle noOFDevils : " + noOfDevils);
	}

	public static void main(String[] args) {
		Annabelle obj = new Annabelle("Ghost","I will kill u da i will kill u ......grrr",5);
		Annabelle object = new Annabelle("Athreya","I will kill u da i will kill u ......grrr",10);
		System.out.println("====================");
		obj.AnnabelleDetails();
		object.AnnabelleDetails();
		
	}

}
