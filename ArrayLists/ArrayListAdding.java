package ArrayLists;

import java.util.ArrayList;

public class ArrayListAdding {

	public static void main(String[] args) {
		ArrayList<Object> arr_int = new ArrayList<Object>();
		arr_int.add(20);
		arr_int.add(30);
		System.out.println(arr_int);
		
		ArrayList<String> arr_str = new ArrayList<String>();
		arr_str.add("Sachin");
		arr_str.add("Dhoni");
		System.out.println(arr_str);
		arr_str.add(0,"Virat");
		System.out.println(arr_str);
		
		arr_int.addAll(arr_str);
		System.out.println(arr_int);

	}

}
