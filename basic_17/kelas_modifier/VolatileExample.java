package basic_17.kelas_modifier;

public class VolatileExample {
	/* Coba hilangkan modifier volatile untuk melihat perbedaannya */
	public volatile int VOLATILE_VAR = 0;
	
	public void lihatHasil() {
		Thread printVolatileVar = new Thread() {
			public void run() {
				/* menuju ke memori utama, dengan thread masing2 */
				/* penjelasannya ada di http://tutorials.jenkov.com/java-concurrency/volatile.html */
				int x = VOLATILE_VAR;
				while(true) {
					/* Disini berulang dan periksa VOLATILE_VAR */
					/* Kondisi dibawah ini jika saat perulangan x tidak sama dengan
					 * VOLATILE_VAR dan cetak hasilnya
					 */
					if(x != VOLATILE_VAR) {
						System.out.println("printXVar = "+x);
						System.out.println("printVolatileVar = "+VOLATILE_VAR);
						x = VOLATILE_VAR;
					}
				}
			}
		};
		
		Thread incrementVolatileVar = new Thread() {
			public void run() {
				while(true){
					++VOLATILE_VAR;
					System.out.println("IncrementedVolatileVar == "+VOLATILE_VAR);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		printVolatileVar.start();
		incrementVolatileVar.start();
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		VolatileExample volatileExample = new VolatileExample();
		volatileExample.lihatHasil();
	}
}
