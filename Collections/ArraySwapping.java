package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySwapping {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sachin");
		names.add("Dhoni");
		names.add("Virat");
		names.add("Sehwag");
		for(String temp : names) {
			System.out.println(temp);
		}
		System.out.println("=======================");
		Collections.swap(names, 1, 3);
		for(String temp : names) {
			System.out.println(temp);
		}
	}

}
