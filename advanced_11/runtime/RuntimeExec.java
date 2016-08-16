package advanced_11.runtime;

/* Contoh sederhana menggunakan runtime
 * untuk memanggil notepad.exe
 */

public class RuntimeExec {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process proc;
		try {
			proc = rt.exec("notepad");
			proc.waitFor(); /* cobalah menghapus baris ini */
		} catch (Exception e) {
			System.out.println("regedit is an unknown command.");
		}
	}
}
