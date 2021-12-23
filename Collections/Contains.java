package Collections;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		ArrayList<String> arr_str = new ArrayList<String>();
		arr_str.add("Madhu");
		arr_str.add("Pavan");
		arr_str.add("venkat");
		arr_str.add("Naga");
		 
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Madhu");
		arr.add("Pavan");
		arr.add("venkat");
		arr.add("Naga");
		
		ArrayList<String> new_Array = new ArrayList<String>();
		//checking elements contained in both the lists
		for(String temp : arr_str) {
			new_Array.add(arr.contains(temp)?"Yes" : "No");
			System.out.println(new_Array);
		}

	}

}
