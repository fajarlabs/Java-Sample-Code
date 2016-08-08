package advanced_6.aneka_collection;

import java.util.LinkedHashSet;

/*
 * Turunan HashSet dengan memungkinkan insertion-order iterations.
 */

public class LinkedHashSetDemo {
	public static void lihatHasil() {
		// create a hash set
		LinkedHashSet hs = new LinkedHashSet();
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
	}
}
