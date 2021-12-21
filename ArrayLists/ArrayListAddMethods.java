package ArrayLists;

import java.util.ArrayList;

public class ArrayListAddMethods {
	public static void main(String[] args) {
		//Adding both array lists
		ArrayList<Object> arr_str = new ArrayList<Object>();
		arr_str.add("Capgemini");
		arr_str.add("Wipro");
		arr_str.add("Acceture");
		arr_str.add("TCS");
		arr_str.add("Cognizant");
		System.out.println("Array list of string type " + arr_str);
		
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		arr_int.add(1);
		arr_int.add(2);
		arr_int.add(3);
		arr_int.add(4);
		arr_int.add(5);
		System.out.println("Array List of integer type " + arr_int);
		
		//Adding two lists
		arr_str.addAll(arr_int);
		System.out.println("Elements after adding");
		System.out.println(arr_str);
	}

}
