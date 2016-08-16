package advanced_5.jenis_algoritma;

public class Fibonacci {

	public void lihatHasil() {
		Fibonacci f = new Fibonacci();
		System.out.println("Deret Fibonacci : ");
		for (int i = 0; i < 10; i++)
			System.out.print(f.HitungDeret(i) + " ");
		
		System.out.print("...");
	}

	public int HitungDeret(int x) {
		if (x == 0)
			return x;
		else if (x == 1)
			return x;
		else
			return HitungDeret(x - 1) + HitungDeret(x - 2);
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.lihatHasil();
	}
}
