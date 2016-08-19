package advanced_9.multithread_dasar;
/**
 * 
 * @author masfajar
 * @category thread
 *
 */
public class DeadLockExample {

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		
		final String resource1 = "Sumber I";
		final String resource2 = "Sumber II";
		
		/* T1 mencoba untuk mengunci resource1 lalu resource II */
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					/* Terjadi deadlock disini, ketika ini akan di kunci,
					 * ternyata sudah terkunci dahulu oleh t2 
					 * sedangkan T2 menunggu agar T1 melepaskan kunci pada
					 * resource1
					 */
					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		/* t2 mencoba untuk mengunci resource II lalu resource I */
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					/* Menunggu T1 agar melepaskan kunci pada resource1 */
					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}