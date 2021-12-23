package Collections;

import java.util.ArrayList;
import java.util.List;
public class CopyList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Madhu");
		arr.add("Pavan");
		arr.add("venkat");
		arr.add("Naga");
		System.out.println("Before Copying " + arr);
		List<String> array = new ArrayList<String>();
		array.add("Madhu");
		array.add("Pavan");
		array.add("venkat");
		array.add("Naga");
		System.out.println(array);
		
		arr.addAll(array);
		System.out.println("After copying " + arr);
	}

}
