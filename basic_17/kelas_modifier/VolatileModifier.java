package basic_17.kelas_modifier;

class VolatileData {
	
	// variable volatile
	private volatile int counter = 0;
	
	public int getCounter() {
		return counter;
	}
	
	public void increaseCounter() {
		++counter;
	}
}

class VolatileThread extends Thread {
	private final VolatileData data;
	
	public VolatileThread(VolatileData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		int firstValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId()
				+ "]: 1 value = " + firstValue);
		
        data.increaseCounter();
        
        int secondValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId()
				+ "]: 2 value = " + secondValue);
		
		data.increaseCounter();
		
        int thirdValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId()
				+ "]: 3 value = " + thirdValue);
	}
}

public class VolatileModifier {
	public void cetakHasil() {
		VolatileData volatileData = new VolatileData();
		Thread thread1 = new Thread(new VolatileThread(volatileData));
		Thread thread2 = new Thread(new VolatileThread(volatileData));
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 	Hasilnya seperti berikut dan bisa jadi berubah-ubah
		 	volatile seperti data yang tersimpan dan synchronize antar thread
		 	dan terjamin dibaca berurutan setelah ter-update antar thread
		 	jadi tidak terjadi racing / balapan antar thread
		 	
		 	http://stackoverflow.com/questions/106591/do-you-ever-use-the-volatile-keyword-in-java
		 	
			[Thread 13]: 1 value = 0   // Thread 3 berisi 0
			[Thread 11]: 1 value = 0   // Waiting dan sama berisi 0
			[Thread 13]: 2 value = 1   // Waiting dan +1
			[Thread 11]: 2 value = 2   // Waiting dan +1
			[Thread 13]: 3 value = 3   // dan seterusnya...
			[Thread 11]: 3 value = 4
		*/
	}
}
