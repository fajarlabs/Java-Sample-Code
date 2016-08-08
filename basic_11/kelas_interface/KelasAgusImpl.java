package basic_11.kelas_interface;

public class KelasAgusImpl implements IManusia {

	@Override
	public void nama() {
		System.out.println("Agus");
	}

	@Override
	public String jenisKelamin(char jenisKelamin) {
			 
		if(jenisKelamin == 'L') {
			return "Laki-laki";
		}
		
		if(jenisKelamin == 'P') {
			return "Perempuan";
		}
		
		return null;
	}

}
