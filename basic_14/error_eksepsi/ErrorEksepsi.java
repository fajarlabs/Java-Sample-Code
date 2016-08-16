package basic_14.error_eksepsi;

public class ErrorEksepsi {
	
	public void lihatHasil() {
		int i = 1;
		int j = 0;
		
		try {
			int k = i / 0;
		} catch(Exception e){
			/* Tangkap eksepsi-nya disini */
			
			/* Cetak errornya dan trace errornya */
			e.printStackTrace();
			
			/*
			java.lang.ArithmeticException: / by zero
			at basic.error_eksepsi.ErrorEksepsi.cetakHasil(ErrorEksepsi.java:9)
			at Application.main(Application.java:9)
			*/
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		ErrorEksepsi errorEksepsi = new ErrorEksepsi();
		errorEksepsi.lihatHasil();
	}
}
