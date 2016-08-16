package advanced_11.runtime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessBuilderExec {
	
	/* Ref :
	 * http://www.tutorialspoint.com/java/lang/processbuilder_command_list.htm
	 * http://stackoverflow.com/questions/6856028/difference-between-processbuilder-and-runtime-exec */
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		
		/* Perbedaan Runtime dan ProccessBuilder adalah
		 * Runtime mengambil single string perintah lalu eksekusi,  
		 * ProcessBuilder mengambil token string perintahnya dimasukkan 
		 * kedalam array sebelum di eksekusi
		 */

		/* buat daftar argumen */
		List<String> list = new ArrayList<String>();
		
		/* Panggil notepad.exe */
		list.add("notepad.exe");
		
		/* Argumen berikutnya membuka file txt */
		list.add("text.txt");

		/* Buat processBuilder */
		ProcessBuilder pb = new ProcessBuilder(list);

		/* set daftar command */
		pb.command(list);
		
		/* Start command */
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/* Cetak daftar command */
		System.out.println("" + pb.command());
	}
}
