package advanced_9.multithread_dasar;

public class Konsumen implements Runnable {
	Barang sd;
	int banyakTransaksi = 10; /* 10 kali */

	Konsumen(Barang sd) {
		this.sd = sd;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		for (int i = 0; i < banyakTransaksi; i++) {
			sd.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}