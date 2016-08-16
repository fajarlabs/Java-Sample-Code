package advanced_6.aneka_collection;

import java.util.TreeSet;
/*
 * Mengimplementasikan 1 set disimpan kedalam tree / pohon. Ini turunan AbstractSet
 */
public class TreeSetDemo {
	public void lihatHasil() {
		
		/* Buat sebuah tree set */
		TreeSet ts = new TreeSet();
		
		/* Tambahkan elemen kedalam tree set */
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		TreeSetDemo treeSetDemo = new TreeSetDemo();
		treeSetDemo.lihatHasil();
	}
}
