package advanced_6.aneka_collection;

import java.util.HashSet;

/*
 * Turunan AbstractSet menggunakan hash table.
 */

public class HashSetDemo {
	
	public void lihatHasil() {
		
		/* Buat sebuah hash set */
		HashSet hs = new HashSet();
		
		/* Tambahkan elemen kedalam hash set */
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
		HashSetDemo hashSetDemo = new HashSetDemo();
		hashSetDemo.lihatHasil();
	}
}
