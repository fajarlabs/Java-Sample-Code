package basic_4.method_dasar;

public class MethodDasar {
	
	/* Uji coba method void dengan return */
	public void testVoidMethodReturn(boolean condition) {
		
		/* Jika condition == true maka
		hanya tercetak "HELLO" */
		if(condition) {
			System.out.println("HELLO");
			return; // Return tanpa data
		}
		
		System.out.println("WORLD");
	}
	
	/* Uji coba return integer */
	public Integer testReturnInteger() {
		return 12;
	}
	
	/* Uji coba return String */
	public String testReturnString() {
		return "HELLO STRING";
	}
	
	/* Uji coba return double */
	public Double testReturnDouble() {
		return 3.0;
	}
	
	/* Uji coba return boolean */
	public Boolean testReturnBoolean() {
		return true;
	}
}
