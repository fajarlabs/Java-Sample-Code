package basic_14.error_eksepsi;

public class ErrorEksepsi {
	public void cetakHasil() {
		int i = 1;
		int j = 0;
		
		try {
			int k = i / 0;
		} catch(Exception e){
			e.printStackTrace();
			/*
			java.lang.ArithmeticException: / by zero
			at basic.error_eksepsi.ErrorEksepsi.cetakHasil(ErrorEksepsi.java:9)
			at Application.main(Application.java:9)
			*/
		}
	}
}
