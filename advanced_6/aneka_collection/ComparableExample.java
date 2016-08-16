package advanced_6.aneka_collection;

import java.lang.Comparable;

/* Class referensi, properti dan setter getter dari kelas ini sendiri bukan dari ClassExample */
public class ComparableExample implements Comparable<ComparableExample>{
	private Long id;
	
	@Override
	public int compareTo(ComparableExample o) {
		ComparableExample c = (ComparableExample) o;
		/* jika seperti dibawah ini, maka ? */
		/* return c.getId().compareTo(getId()); */
		/* hasilnya adalah ascending */
		
		/* jika menginginkan hasil DESCENDING */
		return getId().compareTo(c.getId());
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
}
