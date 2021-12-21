package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListModel {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Sachin");
		obj.add("Dhoni");
		obj.add("Virat");
		obj.add("Sehwag");
		
		//Using advanced loop
		System.out.println("****************using advanced loop******************");
		for(String temp : obj) {
			System.out.println(temp);
		}
		//Using for loop
		System.out.println("****************using for loop****************");
		for(int i=0; i<obj.size(); i++) {
			System.out.println(obj.get(i));
		}
		//using while loop
		System.out.println("****************using while loop****************");
		int counter = 0;
		while(obj.size()>counter) {
			System.out.println(obj.get(counter));
			counter++;
		}
		//Using iterator
		System.out.println("****************Using Iterator****************");
		Iterator<String> itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
