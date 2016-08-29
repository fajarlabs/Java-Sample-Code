package basic_20.static_initialization_blocks;

public class ContohKelasStatic {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		/* 3x instansiasi tetapi hanya muncul "Halo Dunia" 1x */
		KelasStatic o1 = new KelasStatic();
		KelasStatic o2 = new KelasStatic();
		KelasStatic o3 = new KelasStatic();
		
		/* hasil : "Halo Dunia" hanya 1x */
	}
}
