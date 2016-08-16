package advanced_9.multithread_dasar;
/*
 * Cara 2 menggunakan thread
 * 
 * join : adalah menggambungkan thread a dengan thread b dan thread-thread lainnya dengan alur proses
 * thread b harus menunggu thread a selesai, thread c harus menunggu thread b selesai dan seterusnya.
 * 
 * setPriority : adalah methode untuk memprioritaskan thread tersebut jika thread tersebut
 * diset maximal maka thread tersebut akan didahulukan
 * 
 * setDaemon : adalah methode agar tidak mencegah program keluar oleh JVM  ketika program telah selesai, akan tetapi akan tetap berjalan.
 * 
 */
public class RunnableDemo implements Runnable {

	String threadName;
	public RunnableDemo(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		/* Ini adalah methode dari interface Runnable */
		for(int i=0; i < 5; i++) {
			try {
				System.out.println("Pesan dari thread : "+threadName+" ke "+i);
				int miliDetik = 1000; /* 1 detik */
				Thread.sleep(miliDetik);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void lihatHasil() {
		// Thread pertama T1
		RunnableDemo runnableDemo = new RunnableDemo("T1");
		Thread t1 = new Thread(runnableDemo);
		t1.start();
		/* Lihat hasil menggunakan join */
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.setPriority(Thread.NORM_PRIORITY);
	    /* t1.setDaemon(false); */
		
		/* Thread kedua T2 */
		RunnableDemo runnableDemo2 = new RunnableDemo("T2");
		Thread t2 = new Thread(runnableDemo2);
		t2.start();
		/* Lihat hasil jika menggunakan join */
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.setPriority(Thread.MAX_PRIORITY);
	    t2.setDaemon(true);
		
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		RunnableDemo.lihatHasil();
	}

}
