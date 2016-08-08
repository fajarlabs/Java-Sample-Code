package basic_7.kelas_overload;

public class OverloadConstructor {
	@SuppressWarnings("unused")
	private String data_1;
	@SuppressWarnings("unused")
	private Integer data_2;
	@SuppressWarnings("unused")
	private Boolean data_3;

	public OverloadConstructor(String data_1) {
		this.data_1 = data_1;
		System.out.println("Constructor-nya String : "+data_1);
	}
	
	public OverloadConstructor(Integer data_2) {
		this.data_2 = data_2;
		System.out.println("Constructor-nya Integer : "+data_2);
	}
	
	public OverloadConstructor(Boolean data_3) {
		this.data_3 = data_3;
		System.out.println("Constructor-nya Boolean : "+data_3);
	}
	
	public OverloadConstructor() {
		System.out.println("Tanpa Constructor");
	}
	
	// Copy dan paste di class Application didalam methode void main
	/*
	 new OverloadConstructor("HelloWorld");
	 new OverloadConstructor(4);
	 new OverloadConstructor(false);
	 new OverloadConstructor();
	 */

}
