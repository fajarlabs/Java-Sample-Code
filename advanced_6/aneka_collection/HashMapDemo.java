package advanced_6.aneka_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * Turunan AbstractMap dengan menggunakan hash table.
 */
public class HashMapDemo {
	
	public void lihatHasil() {
		
		/* Buat sebuah hash map */
		HashMap hm = new HashMap();
		
		/* Taruh elemen kedalam map */
		hm.put("Wawan", new Double(3434.34));
		hm.put("Sindu", new Double(123.22));
		hm.put("Heri", new Double(1378.00));
		hm.put("Farid", new Double(99.22));
		hm.put("Akbar", new Double(-19.08));

		/* Dapatkan set entri */
		Set set = hm.entrySet();
		
		/* Dapatkan iteratornya */
		Iterator i = set.iterator();
		
		/* Tampilkan elemen */
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		/* Deposit 1000 into Wawan account */
		double balance = ((Double) hm.get("Wawan")).doubleValue();
		hm.put("Wawan", new Double(balance + 1000));
		System.out.println("Wawan's new balance: " + hm.get("Wawan"));
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public void main(String[] args) {
		HashMapDemo hashMapDemo = new HashMapDemo();
		hashMapDemo.lihatHasil();
	}
}
