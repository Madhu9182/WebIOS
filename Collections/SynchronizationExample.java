package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizationExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sachin");
		names.add("Dhoni");
		names.add("Virat");
		names.add("Sehwag");
		//Iterating on ArrayList
		synchronized(names) {
			Iterator<String> itr = names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				//Once we iterate through ArrayList we can't modify like add,remove
				//it throws unSupportedError
				//it.remove();
			}
		}
	}

}
