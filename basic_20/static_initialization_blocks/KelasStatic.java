package basic_20.static_initialization_blocks;

public class KelasStatic {
	
	/* Blok inisialisasi static
	 * dibawah ini hanya di inisialisasi sekali, walau kelas ini 
	 * dipakai berkali-kali
	 */
	static {
		System.out.println("Halo Dunia");
	}
}
