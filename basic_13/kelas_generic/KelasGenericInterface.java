package basic_13.kelas_generic;

/* Tahap I
 * Membuat interface IInduk
 */
interface IInduk {
	public void sapa();
}

/* Tahap II
 * Membuat kelas implementasi dari interface IInduk
 */
class KelasTurunanIInduk implements IInduk {

	@Override
	public void sapa() {
		System.out.println("Saya implementasi interface induk");
	}
}

/* Tahap III
 * Contoh kelas generic yang mengharuskan parameter
 * generic harus turunan/implementasi IInduk
 * perhatikan karakter <T extends IInduk>
 */
class GenericInterface <T extends IInduk> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}	
}

/* Tahap IV
 * Cara menggunakan kelas generic-nya
 */
public class KelasGenericInterface {
	
	public void lihatHasil() {
		/* Cara menggunakannya */
		GenericInterface<KelasTurunanIInduk> genericInterface = new GenericInterface<>();
		
		/* Buat sebuah intansiasi object, dimana ini adalah nilai 
		 yang akan dilewatkan kedalam methode KelasGenericInterface */
		KelasTurunanIInduk kelasTurunanIInduk = new KelasTurunanIInduk();
		genericInterface.setData(kelasTurunanIInduk);
		
		/* Mendapatkan hasilnya */
		@SuppressWarnings("unused")
		KelasTurunanIInduk hasil = genericInterface.getData();
		
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		KelasGenericInterface kelasGenericInterface = new KelasGenericInterface();
		kelasGenericInterface.lihatHasil();
	}
}
