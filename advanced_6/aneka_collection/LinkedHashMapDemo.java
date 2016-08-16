package advanced_6.aneka_collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/*
 * Turunan HashMap dengan memungkinkan insertion-order iterations.
 */
public class LinkedHashMapDemo {
	
	public static void lihatHasil() {
		
		/* Buat sebuah hash map */
		LinkedHashMap lhm = new LinkedHashMap();
		
		/* Taruh elemen-elemen kedalam map */
		lhm.put("Wawan", new Double(3434.34));
		lhm.put("Sindu", new Double(123.22));
		lhm.put("Heri", new Double(1378.00));
		lhm.put("Farid", new Double(99.22));
		lhm.put("Akbar", new Double(-19.08));

		/* Dapatkan set entri */
		Set set = lhm.entrySet();
		
		/* Dapatkan iterator-nya */
		Iterator i = set.iterator();
		
		/* Tampilkan elemen-nya */
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		// Deposit 1000 into Wawan's account
		double balance = ((Double) lhm.get("Wawan")).doubleValue();
		lhm.put("Wawan", new Double(balance + 1000));
		System.out.println("Wawan's new balance: " + lhm.get("Wawan"));
	}
}
