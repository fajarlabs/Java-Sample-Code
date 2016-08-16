package basic_6.kelas_override;

public class KelasAnak extends KelasInduk {
	
	/**
	 * Methode untuk men-cetak hobi
	 * Menggunakan anotasi @Override agar memberitahukan
	 * compiler bahwa methode tersebut dioverride oleh turunannya
	 */
	@Override
	public void hobi() {
		System.out.println("Hobi Anak : Main Pokemon");
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args){
		KelasAnak kelasAnak = new KelasAnak();
		kelasAnak.hobi();
	}
}
