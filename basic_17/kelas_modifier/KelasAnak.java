package basic_17.kelas_modifier;

public class KelasAnak extends KelasInduk {
	
	/**
	 * Methode untuk mengetest akses mofier-nya
	 */
	public void cetakModifier() {
		// Mengakases variabel yang diberi akses modifier protected
		this.hobi = "Membaca";
		// Cetak
		System.out.println(getHobi());
		
		// Mengakses variabel yang diberi akses modifier public
		this.cita_cita = "Guru";
		// Cetak
		System.out.println(getCita_cita());
		
		// Mengakses variabel yang diberi akses modifier private
		// this.nama = "Agus"; // Ini terjadi error
		
		// Cara benar mengakses private
		// dengan menggunakan methode yang sudah di definisikan
		setNama("Agus");
		System.out.println(getNama());
	}

}
