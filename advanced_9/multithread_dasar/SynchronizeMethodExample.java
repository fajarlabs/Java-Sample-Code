package advanced_9.multithread_dasar;

/* Contoh class Table dengan metode dan modifier synchronize */
class Table {

	/* Metode synchronize */
	synchronized void printTable(int n,String name) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Class name : "+name+ " : "+(n * i));
			try {
				/* Thread sleep 1 detik */
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

/* Buat class thread-1 */
class Thread_1 extends Thread {
	Table t;

	Thread_1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5,"Thread_1");
	}

}

/* Buat class thread-2 */
class Thread_2 extends Thread {
	Table t;

	Thread_2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100,"Thread_2");
	}
}

class SynchronizeMethodExample {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String args[]) {
		/* Data object-nya */
		Table obj = new Table();
		Thread_1 t1 = new Thread_1(obj);
		Thread_2 t2 = new Thread_2(obj);
		/* Start thread */
		t1.start();
		t2.start();
	}
}