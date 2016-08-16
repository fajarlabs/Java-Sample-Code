package basic_1.main_dasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputFromKeyboard {

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		System.out.print("Silahkan masukkan namamu :");
		try {
			/* Menunggu inputan dan enter */
			name = dataIn.readLine();
		} catch (IOException e) {
			System.out.println("Error!");
		}
		System.out.println("Halo " + name + "!");
	}
}