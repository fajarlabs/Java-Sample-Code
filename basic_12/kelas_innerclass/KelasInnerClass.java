package basic_12.kelas_innerclass;

// Membuat kelas diluar kelas
class KelasDiluarKelas {
	public void info() {
		System.out.println("Kelas diluar kelas");
	}
}

public class KelasInnerClass {
	
	// Menggunakan kelas diluar kelas
	public void cetakKelasDiluarKelas() {
		KelasDiluarKelas kelasDiluarKelas = new KelasDiluarKelas();
		kelasDiluarKelas.info();
	}
	
	// Membuat kelas didalam kelas
	class KelasDidalamKelas {
		public void info() {
			System.out.println("Kelas didalam kelas");
		}
	}
	
	// Menggunakan kelas didalam kelas
	public void cetakKelasDidalamKelas() {
		KelasDidalamKelas kelasDidalamKelas = new KelasDidalamKelas();
		kelasDidalamKelas.info();
	}
	
	// Menggunakan kelas didalam method
	public void cetakKelasDialamMethod() {
		
		// Membuat kelas didalam method
		class KelasDidalamMethod {
			public void info() {
				System.out.println("Kelas didalam method");
			}
		}
		
		KelasDidalamMethod kelasDidalamMethod = new KelasDidalamMethod();
		kelasDidalamMethod.info();
	}
}
