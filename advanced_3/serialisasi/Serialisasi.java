package advanced_3.serialisasi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisasi {
	public static void lihatHasil() {
		Employee e = new Employee();
		e.name = "Andi Kurniawan";
		e.address = "Depok, Jawa Barat";
		e.SSN = 23445443;
		e.number = 313;

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
