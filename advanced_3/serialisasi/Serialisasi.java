package advanced_3.serialisasi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisasi {
	
	public void lihatHasil() {
		Employee e = new Employee();
		e.name = "Fajarlabs";
		e.address = "Depok, Jawa Barat";
		e.SSN = 23445443;
		e.number = 313;

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Data serialisasi ini disimpan di /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		Serialisasi serialisasi = new Serialisasi();
		serialisasi.lihatHasil();
	}
}
