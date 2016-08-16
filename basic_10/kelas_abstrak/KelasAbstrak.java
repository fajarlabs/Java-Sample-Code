package basic_10.kelas_abstrak;

/*Kelas ini tidak bisa langsung digunakan langsung / inisialisasi langsung
menggunakan keyword new */
public abstract class KelasAbstrak {
	
	/* Ini harus di implementasikan oleh turunan
	apabila tidak diimplementasikan akan error */
	public abstract void methodeAbstrak();
	public abstract String dataAbstract(String dataAbstract);
	
	public void pesan() {
		System.out.println("Hello methode dari Abstrak");
	}
	
}
