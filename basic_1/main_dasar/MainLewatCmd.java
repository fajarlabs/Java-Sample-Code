package basic_1.main_dasar;

public class MainLewatCmd {
	
	// Apabila di export menjadi file .jar dan dijalankan di command prompt maka
	// akan seperti berikut ini
	// File export .jar di taruh di drive D:\test.jar
	// maka cara memanggil di command promptnya sebagai berikut ini
	// run CMD
	// > java -jar test.jar nilai1 nilai2 nilai3
	
	public static void main(String[] args) {

		String argument_1 = null, argument_2 = null, argument_3 = null;

		if (args[0] != null) {
			argument_1 = args[0];

			System.out.println("Argument 1 : " + argument_1);
		}

		if (args[1] != null) {
			argument_2 = args[1];

			System.out.println("Argument 2 : " + argument_2);
		}

		if (args[2] != null) {
			argument_3 = args[2];

			System.out.println("Argument 3 : " + argument_3);
		}
	}
}
