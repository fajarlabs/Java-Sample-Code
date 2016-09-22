package advanced_9.multithread_dasar;

public class ThreadJoinExample {

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			boolean b1 = false;
			int i = 0;
			@Override
			public void run() {
				while(!b1) {
					if(i > 5)
						b1 = true;
					System.out.println("Thread-1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					i++;
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			boolean b1 = false;
			int i = 0;
			@Override
			public void run() {
				while(!b1) {
					if(i > 5)
						b1 = true;
					System.out.println("Thread-2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					i++;
				}
			}
		});
		
		/* Memulai thread 1 */
		t1.start();
		/* Menunggu thread 1 ini selesai */
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		/* Setelah thread 1 selesai lalu t2 yang akan dijalankan */
		t2.start();
		/* tunggu thread t2 selesai */
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}	
