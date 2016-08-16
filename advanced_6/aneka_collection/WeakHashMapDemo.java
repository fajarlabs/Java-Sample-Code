package advanced_6.aneka_collection;

import java.util.Map;
import java.util.WeakHashMap;
/*
 * Turunan AbstractMap dengan menggunakan sebuah hash table dengan weak keys.
 */
public class WeakHashMapDemo {
	private static Map map;

	public static void lihatHasil() {
		map = new WeakHashMap();
		map.put(new String("Wawan"), "Sindu");

		Runnable runner = new Runnable() {
			public void run() {
				while (map.containsKey("Wawan")) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException ignored) {
					}
					System.out.println("Thread waiting");
					System.gc();
				}
			}
		};
		Thread t = new Thread(runner);
		t.start();
		System.out.println("Main waiting");
		try {
			t.join();
		} catch (InterruptedException ignored) {
			ignored.printStackTrace();
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		WeakHashMapDemo weakHashMapDemo = new WeakHashMapDemo();
		weakHashMapDemo.lihatHasil();
	}
}