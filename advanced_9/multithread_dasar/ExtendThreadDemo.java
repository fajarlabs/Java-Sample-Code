package advanced_9.multithread_dasar;
/*
 * Cara 1 menggunakan Thread
 */
public class ExtendThreadDemo extends Thread {
	
	String threadName;
	public ExtendThreadDemo(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		// Ini adalah methode dari interface Runnable
		for(int i=0; i < 5; i++) {
			try {
				System.out.println("Pesan dari thread : "+threadName+" ke "+i);
				int miliDetik = 1000; // 1 detik
				Thread.sleep(miliDetik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void lihatHasil() {
		// Thread pertama T1
		Thread threadDemo = new ExtendThreadDemo("T1");
		threadDemo.start();
		
		// Thread kedua T2
		Thread threadDemo2 = new ExtendThreadDemo("T2");
		threadDemo2.start();
	}
}
