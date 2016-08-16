package advanced_6.aneka_collection;

import java.util.LinkedHashSet;

/*
 * Turunan HashSet dengan memungkinkan insertion-order iterations.
 */

public class LinkedHashSetDemo {
	
	public void lihatHasil() {
		/* Buat sebuah hash set */
		LinkedHashSet hs = new LinkedHashSet();
		
		/* add elements to the hash set */
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		LinkedHashSetDemo linkedHashSetDemo = new LinkedHashSetDemo();
		linkedHashSetDemo.lihatHasil();
	}
}
