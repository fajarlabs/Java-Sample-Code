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
		map.put(new String("Maine"), "Augusta");

		Runnable runner = new Runnable() {
			public void run() {
				while (map.containsKey("Maine")) {
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
		}
	}
}