package experiment_4.graphic_environment;

import java.awt.GraphicsEnvironment;

/* Menampilkan semua daftar font yang terdapat pada environment */
public class FontList {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		String[] result = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String s : result) {
			System.out.println(s);
		}
	}
}
