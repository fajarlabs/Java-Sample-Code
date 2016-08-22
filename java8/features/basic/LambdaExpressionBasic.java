package java8.features.basic;

interface Manusia {
	void nama(String nama);
}

interface OperasiMatematika {
	int operasi(int a, int b);
}

public class LambdaExpressionBasic {
	
	public void lambda_1() {
		
		/* Sebelum java 8 */
		Manusia im = new Manusia() {
			@Override
			public void nama(String nama) {
				System.out.println("Halo "+nama+"!");
			}
		};
		im.nama("agus");

		/* Di java8 */
		/* Jika ingin lebih dari satu baris badan metode */
		Manusia im2 = (n) -> {
			System.out.println("Cetak 1 "+n+"!");
			System.out.println("Cetak 2 "+n+"!");
		};
		im2.nama("dika");
		
		/* Jika hanya ingin sebaris */
		Manusia im3 = (n) -> System.out.println("Cetak sebaris "+n);
		im3.nama("wawan");
	
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */	
	public static void main(String[] args) {
		LambdaExpressionBasic lambdaExpressionBasic = new LambdaExpressionBasic();
		lambdaExpressionBasic.lambda_1();
	}
}
