package advanced_6.aneka_collection;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Turunan AbstractMap dan menggunakan referensi persamaan ketika membandingkan dokumen.
 */
public class IdentityHashMapDemo {
	public static void lihatHasil() {
		// Create a hash map
		IdentityHashMap ihm = new IdentityHashMap();
		// Put elements to the map
		ihm.put("Zara", new Double(3434.34));
		ihm.put("Mahnaz", new Double(123.22));
		ihm.put("Ayan", new Double(1378.00));
		ihm.put("Daisy", new Double(99.22));
		ihm.put("Qadir", new Double(-19.08));

		// Get a set of the entries
		Set set = ihm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = ((Double) ihm.get("Zara")).doubleValue();
		ihm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " + ihm.get("Zara"));
	}
}
