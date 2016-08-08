package advanced_6.aneka_collection;

import java.util.HashSet;

/*
 * Turunan AbstractSet menggunakan hash table.
 */

public class HashSetDemo {
	public static void lihatHasil() {
		// create a hash set
		HashSet hs = new HashSet();
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
