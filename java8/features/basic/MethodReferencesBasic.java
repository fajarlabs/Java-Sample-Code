package java8.features.basic;

import java.util.List;
import java.util.ArrayList;

public class MethodReferencesBasic {

	/*
	 * Contoh metode ini untuk array list dengan tipe generic-nya adalah String
	 * jika list di set default maka parameter cetak harus diset sebagai
	 * object(Default)
	 */
	public static void cetak(String abjad) {
		System.out.println(abjad);
	}

	/*
	 * Jalankan file ini dengan cara, Klik kanan -> Run As -> Java Application
	 */
	public static void main(String args[]) {
		/* Daftar list dengan tipe generic String */
		List<String> names = new ArrayList<>();

		/* Add data */
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");

		/* Penggunaan metode referensi */
		names.forEach(MethodReferencesBasic::cetak);
	}
}
