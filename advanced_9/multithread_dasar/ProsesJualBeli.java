package advanced_9.multithread_dasar;

public class ProsesJualBeli {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		Barang barang = new Barang();
		new Konsumen(barang); /* Anonymous intance */
		new Produsen(barang); /* Anonymous intance */
	}

}
