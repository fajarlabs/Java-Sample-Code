package basic_9.kelas_eskapsulasi;

public class Motor {
	private String merek;
	private Integer cc;
	private String model;
	
	/**
	 * Constructor menggunakan field / variabel
	 * @param merek
	 * @param cc
	 * @param model
	 */
	public Motor(String merek, Integer cc, String model) {
		super();
		this.merek = merek;
		this.cc = cc;
		this.model = model;
	}
	
	/**
	 * Constructor tanpa menggunakan field / variabel
	 */
	public Motor() {}
	
	// Methode-methode
	
	public String getMerek() {
		return merek;
	}
	public void setMerek(String merek) {
		this.merek = merek;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
