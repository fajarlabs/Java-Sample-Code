package basic_13.kelas_generic;

// Tahap I
// Membuat Kelas GenericSederhana
// Perhatikan karakter <T>
class GenericSederhana<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
} 

// Tahap II
// Cara menggunakan kelas GenericSederhana
public class KelasGenericSederhana {
	
	public void cetakHasil() {
		// Inisialisasi variabel ber-tipe data String beserta isinya
		String hello = "Halo";
		
		// Cara menggunakannya
		GenericSederhana<String> genericSederhana = new GenericSederhana<>();
		genericSederhana.setData(hello);
		System.out.println(genericSederhana.getData());
		
		GenericSederhana<Boolean> genericSederhana2 = new GenericSederhana<>();
		genericSederhana2.setData(true);
	}
}
