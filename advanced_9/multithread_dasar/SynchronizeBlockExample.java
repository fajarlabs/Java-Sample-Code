package advanced_9.multithread_dasar;


public class SynchronizeBlockExample {
	/* Variable ini yang akan di synchronized */
	StringBuilder o = new StringBuilder();
	
	/* ini diakses oleh thread 1 */
	public void setData(String str) {	
		System.out.println("I'm setter");
		synchronized (o) {
			int k = 5;
			for(int j = 1; j < k; j++) {
				System.out.println("Data ->"+str);
				o.append("Data "+str+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
			
			/* Release wait() */
			o.notify();
		}
	}
	
	/* ini diakses oleh thread 2 */
	public String getData() { 
		System.out.println("I'm getter");
		synchronized (o) {
			try {
				/* wait */
				o.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String z = o.toString();
			o.setLength(0);
			return z;		
		}
	}
	
	public static void main(String[] args) {
		final SynchronizeBlockExample threadSynchronize = new SynchronizeBlockExample();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(threadSynchronize.getData());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				threadSynchronize.setData("Handphone");
			}
		}).start();
	}
	
	/* hasilnya 
	 * 
	 *  Thread 1 start()
		I'm getter
		-- wait()
		Thread 2 start()
		I'm setter
		Data ->Handphone
		Data ->Handphone
		Data ->Handphone
		Data ->Handphone
		-- notify() for release thread 1
		Data Handphone Data Handphone Data Handphone Data Handphone 
	 */
}
