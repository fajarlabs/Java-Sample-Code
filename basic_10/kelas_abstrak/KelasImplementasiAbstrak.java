package basic_10.kelas_abstrak;

/* Kelas turunan dari abstrak
Jika tidak mengimplementasikan methode KelasAbstrak maka
akan terjadi error */
public class KelasImplementasiAbstrak extends KelasAbstrak {

	/* Methode abstract yang tidak mempunyai badan tadi di implementasikan disini
	Harus di implementasikan semua.
	Jika Hanya ingin menurunkannya saja, kelas ini harus diberi modifier abstract
	juga di awal kelas.
	contoh, public abstract class KelasImplementasiAbstrak */
	
	@Override
	public void methodeAbstrak() {
		// TODO Auto-generated method stub
	}

	@Override
	public String dataAbstract(String dataAbstract) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		KelasImplementasiAbstrak kelasImplementasiAbstrak = new KelasImplementasiAbstrak();
		kelasImplementasiAbstrak.pesan();
	}
	
}
