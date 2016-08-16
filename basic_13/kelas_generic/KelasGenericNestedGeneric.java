package basic_13.kelas_generic;

/* Tahap I
 * Membuat kelas induk generic
 */
class Ibu<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

/* Tahap II
 * Membuat kelas anak generic
 */
class Bapak<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

/* Kelas anak turunan ibu yang bertipe generic bapak
 * dan bapak bertipe generic string
 */
class Anak extends Ibu<Bapak<String>> {
	
}

/* Kelas generic didalam generic */
class GenericNestedGeneric <T extends Ibu<Bapak<String>>> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

/* Cara menggunakannya */
public class KelasGenericNestedGeneric {
	
	public void lihatHasil() {
		
		/* Membuat instansiasi generic terlebih dahulu */
		@SuppressWarnings("unused")
		GenericNestedGeneric<Anak> anak = new GenericNestedGeneric<>();
		
		/* Set object Anak */
		Anak sifatAnak = new Anak();
		
		/* Set object Bapak */
		Bapak<String> sifatBapak = new Bapak<>(); 
		
		/* Mengisi data sifat anak */
		sifatAnak.setData(sifatBapak);
		sifatAnak.getData().setData("Pantang Menyerah");
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		KelasGenericNestedGeneric kelasGenericNestedGeneric = new KelasGenericNestedGeneric();
		kelasGenericNestedGeneric.lihatHasil();
	}
}
