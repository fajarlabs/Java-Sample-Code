package advanced_6.aneka_collection;

import java.util.LinkedList;

/*
 * LinkedList adalah class turunan dari AbstractSequentialList
 */

public class LinkedListDemo {
	
	public void lihatHasil() {
		
		/* Buat sebuah linkedlist */
		LinkedList ll = new LinkedList();
		
		/* Tambahkan elemen kedalam linkedlist */
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Elemen aslinya : " + ll);

		/* Hapus sebagian elemennya */
		ll.remove("F");
		ll.remove(2);
		System.out.println("Konten setelah ada penghapusan : " + ll);

		/* Hapus elemen yang ada di posisi pertama dan terakhir */
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll setelah penghapusan : " + ll);

		/* get and set a value */
		Object val = ll.get(2);
		ll.set(2, (String) val + " Berubah");
		System.out.println("ll setelah perubahan : " + ll);
	}

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.lihatHasil();
	}
}
