package basic_4.method_dasar;

public class VarargsExample {

	/* Parameter argumentnya lebih dari satu secara otomatis 
	 * hanya diberi (titik) ... 3 kali lalu ditambahkan nama variabelnya */
	public void printAll(String... array) {
		for (String curr : array)
			System.out.println(curr);
	}

	/* Overloading test */
	public void printAll(String arg) {
		System.out.println(arg);
	}

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		VarargsExample ve = new VarargsExample();
		
		/* Overload metode*/
		ve.printAll("WAWAN", "SINDU", "BUDI","HERU","AGUS","PARTO");
		ve.printAll("ADI");

	}

}
