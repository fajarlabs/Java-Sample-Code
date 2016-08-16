package basic_8.kelas_polimorfisme;

public class KelasAnak extends KelasInduk {
	
	@Override
	public void hobi() {
		System.out.println("Hobi Anak : Main Pokemon");
	}
	
	public void kebiasaan() {
		System.out.println("Makan Permen");
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		KelasInduk kelasInduk = new KelasAnak();
		kelasInduk.hobi();
		kelasInduk.ketrampilan();
		/* Error jika menggunakan metode dari anak, 
		 * hanya mengoverride dari metode yang sama
		 */
		/* kelasInduk.kebiasaan(); */ 

	}
}
