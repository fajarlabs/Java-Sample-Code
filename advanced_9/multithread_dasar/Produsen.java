package advanced_9.multithread_dasar;

public class Produsen implements Runnable {
	Barang sd;
	int banyakTransaksi = 10; /* 10 kali */

	Produsen(Barang sd) {
		this.sd = sd;
		new Thread(this, "Producer").start();
	}

	public void run() {
		for (int i = 0; i < banyakTransaksi ; i++) {
			sd.set((int) (Math.random() * 100)); /* Isi dengan barang/transaksi */
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}