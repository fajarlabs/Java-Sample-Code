package advanced_6.aneka_collection;

import java.util.TreeSet;
/*
 * Mengimplementasikan 1 set disimpan kedalam tree / pohon. Ini turunan AbstractSet
 */
public class TreeSetDemo {
	public static void lihatHasil() {
		// Create a tree set
		TreeSet ts = new TreeSet();
		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
	}
}
