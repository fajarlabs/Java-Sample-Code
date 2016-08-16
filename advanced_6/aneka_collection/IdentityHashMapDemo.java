package advanced_6.aneka_collection;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Turunan AbstractMap dan menggunakan referensi persamaan ketika membandingkan dokumen.
 */
public class IdentityHashMapDemo {
	
	public void lihatHasil() {
		
		/* Buat sebuah hash map */
		IdentityHashMap ihm = new IdentityHashMap();
		
		/* Put element kedalam map */
		ihm.put("Wawan", new Double(3434.34));
		ihm.put("Sindu", new Double(123.22));
		ihm.put("Heri", new Double(1378.00));
		ihm.put("Farid", new Double(99.22));
		ihm.put("Akbar", new Double(-19.08));

		/* Dapatkan set entri */
		Set set = ihm.entrySet();
		
		/* Dapatkan iteratornya */
		Iterator i = set.iterator();
		
		/* Tampilkan elemen-nya */
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		/* Deposit 1000 into Wawan's account */
		double balance = ((Double) ihm.get("Wawan")).doubleValue();
		ihm.put("Wawan", new Double(balance + 1000));
		System.out.println("Wawan's new balance: " + ihm.get("Wawan"));
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		IdentityHashMapDemo identityHashMapDemo = new IdentityHashMapDemo();
		identityHashMapDemo.lihatHasil();
	}
}
