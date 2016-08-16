package advanced_9.multithread_dasar;

public class Barang {
	int data;
	boolean valueSet = false;

	synchronized void set(int value) {
		if (valueSet) { /* baru saja membangkitkan sebuah nilai */
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		}
		System.out.println("Produsen membuat barang : " + value);
		data = value;
		valueSet = true;
		notify();
	}

	synchronized int get() {
		if (!valueSet) { /* produsen belum men-set sebuah nilai */
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		}
		System.out.println("Konsumen membeli barang : " + data);
		valueSet = false;
		notify();
		return data;
	}
}
