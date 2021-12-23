package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class AddingElements {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(5);
		arr.add(2);
		arr.add(1);
		System.out.println("Before sorting" + arr);
		Collections.sort(arr);
		System.out.println("After sorting" + arr);
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("Reverse sorting" + arr);
		System.out.println(System.currentTimeMillis());
	}
}
