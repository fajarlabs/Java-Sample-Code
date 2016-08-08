package basic_17.kelas_modifier;

public class KelasInduk {
	
	// Jenis Kelamin
	// Konstanta di java dengan kata kunci final
	private final String wargaNegara = "Indoneisa";
	
	// Tidak bisa diakses langsung maupun turunannya
	private String nama;
	
	// Hanya bisa diakses oleh turunannya
	protected String hobi;
	
	// Bisa diakses langsung dari luar
	public String cita_cita;
	
	// Bisa diakses langsung tanpa harus di inisialisasi terlebih dahulu
	public static String alamat;
	
	// non-volatile tidak tersimpan 
	// keyword transient mengindikasikan bahwa field ini tidak bisa diserialisasi
	// http://stackoverflow.com/questions/910374/why-does-java-have-transient-fields
	public transient String umur;
	
	// keyword synnchronized dipakai untuk indikasi bahwa method tersebut
	// hanya bisa diakses oleh 1 thread sekali waktu
	public synchronized void sinkronisasi() {
		// Lakukan sesuatu
	}
	
	/**
	 * Methode untuk mendapatkan nama
	 * @return
	 */
	public String getNama() {
		return nama;
	}
	
	/**
	 * Methode untuk mengeset nama
	 * @param nama
	 */
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	/**
	 * Methode untuk mendapatkan data hobi
	 * @return
	 */
	public String getHobi() {
		return hobi;
	}

	/**
	 * Methode untuk mengeset hobi
	 * @param hobi
	 */
	public void setHobi(String hobi) {
		this.hobi = hobi;
	}
	
	/**
	 * Methode untuk mendapatkan cita-cita
	 * @return
	 */
	public String getCita_cita() {
		return cita_cita;
	}
	
	/**
	 * Methode untuk mengeset cita-cita
	 * @param cita_cita
	 */
	public void setCita_cita(String cita_cita) {
		this.cita_cita = cita_cita;
	}
	
}
