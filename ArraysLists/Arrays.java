package ArraysLists;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<String> Companies = new ArrayList<String>();
		Companies.add("Capgemini");
		Companies.add("Wipro");
		Companies.add("TCS");
		Companies.add("Accenture");
		Companies.add("Cognizant");
		
		//using advanced for loop
		System.out.println("===========================Using advanced for loop========================");
		for(String objects : Companies) {
			System.out.println(objects);
		}
		//using for loop
		System.out.println("===========================Using for loop==================================");
		for(int i=0; i<Companies.size(); i++) {
			System.out.println(Companies.get(i));
		}
		System.out.println("===========================Using while loop================================");
		int count = 0;
		while(Companies.size()>count) {
			System.out.println(Companies.get(count));
			count++;
		}
		System.out.println("===========================Using Iterator===================================");
		Iterator<String> itr = Companies.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
