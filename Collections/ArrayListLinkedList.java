package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {

	public static void main(String[] args) {
		//Adding linked list object to the ArrayList
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Madhu");
		arr.add("Pavan");
		arr.add("Naga");
		arr.add("Venkata");
		System.out.println("Elements of Arraylist are " + arr);
		System.out.println("sub list of array list "+arr.subList(0,3));
		System.out.println(arr.indexOf("Madhu"));
		LinkedList<String> list = new LinkedList<String>();
		list.add("Chiru");
		list.add("Nagarjuna");
		list.add("Pavan Kalyan");
		list.add("Balayya");
		System.out.println("Elements of Linkedlist are " + list);
		arr.addAll(list);
		System.out.println("Elements after adding " + arr);
		arr.retainAll(list);
		System.out.println("After using retainAll Method "+arr);
		arr.clone();
		System.out.println("After using clone() method " + arr);
		System.out.println(list.indexOf("Pavan kalyan"));
		arr.set(0, "Hi Mowa");
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.subList(0, 3));
	}

}
