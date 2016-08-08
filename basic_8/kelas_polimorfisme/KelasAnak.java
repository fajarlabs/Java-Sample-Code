package basic_8.kelas_polimorfisme;

public class KelasAnak extends KelasInduk {
	
	@Override
	public void hobi() {
		System.out.println("Hobi Anak : Main Pokemon");
	}
	
	public void kebiasaan() {
		System.out.println("Makan Permen");
	}
	
	/**
	 * Contoh implementasi menggunakan polimorfisme
	 */
	public void contohPolimorfisme() {
		KelasInduk kelasInduk = new KelasAnak();
		kelasInduk.hobi();
		kelasInduk.ketrampilan();
	}
}
