package basic_9.kelas_eskapsulasi;

public class kelas_encapsulation {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		
		/* Cara ke 1
		 * Tanpa inisialisasi nilai untuk contructor
		 */
		Motor motor = new Motor();
		motor.setMerek("Suzuki");
		motor.setCc(1300);
		motor.setModel("Luqury Sport");
		System.out.println(motor.getMerek());
		System.out.println(motor.getCc());
		System.out.println(motor.getModel());
		
		/* Cara ke 2
		 * Dengan inisialisasi constructor
		 */
		Motor motor2 = new Motor("Yamaha",500,"Sport");
		System.out.println(motor2.getMerek());
		System.out.println(motor2.getCc());
		System.out.println(motor2.getModel());
		
	}
}
