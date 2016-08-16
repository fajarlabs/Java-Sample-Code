package advanced_6.aneka_collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
 * Turunan abstractMap dengan menggunakan tree.
 */
public class TreeMapDemo {
	
	public void lihatHasil() {
		
		/* Buat sebuah tree map */
		TreeMap tm = new TreeMap();
		
		/* Put Taruh elemen kedalam tree map */
		tm.put("Wawan", new Double(3434.34));
		tm.put("Sindu", new Double(123.22));
		tm.put("Heri", new Double(1378.00));
		tm.put("Farid", new Double(99.22));
		tm.put("Akbar", new Double(-19.08));

		/* Dapatkan set entri */
		Set set = tm.entrySet();
		
		/* Dapatkan iterator */
		Iterator i = set.iterator();
		
		/* Tampilkan elemen */
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		/* Deposit 1000 into Wawan's account */
		double balance = ((Double) tm.get("Wawan")).doubleValue();
		tm.put("Wawan", new Double(balance + 1000));
		System.out.println("Wawan's new balance: " + tm.get("Wawan"));
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		TreeMapDemo treeMapDemo = new TreeMapDemo();
		treeMapDemo.lihatHasil();
	}
}
