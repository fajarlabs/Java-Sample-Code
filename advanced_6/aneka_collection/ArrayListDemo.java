package advanced_6.aneka_collection;

import java.util.ArrayList;

/*
 * Implementasi array dinamis dari turunan AbstractList
 */

public class ArrayListDemo {
	
	public void lihatHasil() {
		
		/* create an array list */
		ArrayList al = new ArrayList();
		System.out.println("Inisial ukuran awal dari al : " + al.size());

		/* add elements to the array list */
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Ukuran setelah diberi isi: " + al.size());

		/* display the array list */
		System.out.println("Tampilkan daftar konten : " + al);
		
		/* Remove elements from the array list */
		al.remove("F");
		al.remove(2);
		System.out.println("Ukuran setelah di tambah lagi : " + al.size());
		System.out.println("Tampilkan semua konten : " + al);
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		arrayListDemo.lihatHasil();
	}
}
