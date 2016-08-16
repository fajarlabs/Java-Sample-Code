package basic_16.error_assert;

/* Contoh assert adalah sebuah catatan pesan kesalahan
 * Dengan melihat assert, sebuah program tidak perlu lagi membaca seluruh script
 * assert [kondisi1] : [kondisi2]
 * assert harus di enable terlebih dahulu
 * http://stackoverflow.com/questions/11415160/how-to-enable-the-java-keyword-assert-in-eclipse-program-wise
 */

public class ErrorAssert {
	
	public void lihatHasil() {
		/* Isi nilai */
        int number = 11;
         
        /* Stop jika number lebih dari 10 */
        assert number <= 10 : number > 10 ? "Lebih dari sepuluh" : "" ;
        
        /* Dibawah ini tidak akan tercetak */
        System.out.println("Pass");
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		ErrorAssert errorAssert = new ErrorAssert();
		errorAssert.lihatHasil();
	}
}
