package java8.features.basic;

public class DefaultMethodBasic {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}

interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}

	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}

interface FourWheeler {
	void type();

	default void print() {
		System.out.println("I am a four wheeler!");
	}
}

class Car implements Vehicle, FourWheeler {
	
	public void print() {
		/* Bila terdapat keyword default maka
		 * gunakan keyword super untuk mengaksesnya
		 */
		Vehicle.super.print();
		FourWheeler.super.print();
		
		/* Bila terdapat keyword static maka langsung
		 * saja bisa digunakan
		 */
		Vehicle.blowHorn();
		
		/* Cetak info */
		System.out.println("I am a car!");
	}

	@Override
	public void type() {
		System.out.println("Jeep");
	}
}