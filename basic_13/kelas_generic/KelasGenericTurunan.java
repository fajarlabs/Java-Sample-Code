package basic_13.kelas_generic;

/* Tahap I
 * Membuat kelas induk */
class KelasInduk {
	
	public void sapa() {
		System.out.println("Halo, saya ini kelas induk");
	}
}

/* Tahap II
 * Membuat kelas turunan */
class TurunanInduk extends KelasInduk {
	public void sapa() {
		System.out.println("Halo, saya ini kelas turunan induk");
	}	
}

/* Tahap III
 * Membuat kelas generic-nya
 * perhatikan <T extends KelasInduk> */
class GenericTurunan <T extends KelasInduk> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

/* Tahap IV
 * Cara menggunakannya */
public class KelasGenericTurunan {
	
	public void lihatHasil(){
		TurunanInduk turunanInduk = new TurunanInduk();
		
		GenericTurunan<TurunanInduk> genericTurunan = new GenericTurunan<>();
		genericTurunan.setData(turunanInduk);
		
		TurunanInduk hasil = genericTurunan.getData();
		hasil.sapa();
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args){
		KelasGenericTurunan kelasGenericTurunan = new KelasGenericTurunan();
		kelasGenericTurunan.lihatHasil();
	}
}
