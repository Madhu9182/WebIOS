package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsSorting {
	public static void main(String[] args) {
		//create array list for sorting
		ArrayList<String> array = new ArrayList<String>();
		array.add("Chennai");
		array.add("Bangalore");
		array.add("Delhi");
		array.add("Mumbai");
		array.add("Ooty");
		array.add("Ahmadabad");
		array.add("Secundrabad");
		
		System.out.println("*******************Before sorting*******************");
		for(String temp : array) {
			System.out.println(temp);
		}
		
		Collections.sort(array);
		System.out.println("*******************After sorting*********************");
		for(String temp : array) {
			System.out.println(temp);
		}
	}

}
