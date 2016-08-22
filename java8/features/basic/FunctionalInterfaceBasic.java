package java8.features.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceBasic {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/* Predicate<Integer> predicate = n -> true
		n adalah nilai dari daftar array dengan kondisi benar */

		System.out.println("Cetak semua nomor :");

		/* n sebagai parameter */
		prediksi(list, n -> true);

		/* Predicate<Integer> predicate1 = n -> n%2 == 0
		n adalah nilai dari daftar array dengan kondisi
		n mod 2 = 0 */

		System.out.println("Cetak nomor genap :");
		prediksi(list, n -> n % 2 == 0);

		/* Predicate<Integer> predicate2 = n -> n > 3
		n adalah nilai dari daftar array dengan kondisi
		n lebih dari 3 */

		System.out.println("Cetak nomor lebih dari 3 :");
		prediksi(list, n -> n > 3);
	}

	public static void prediksi(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n))
				System.out.println(n + " ");
		}
	}
}