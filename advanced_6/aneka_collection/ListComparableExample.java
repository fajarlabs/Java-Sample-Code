package advanced_6.aneka_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparableExample {

	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		/* Contoh comparable */
		
		List<ComparableExample> ce = new ArrayList<ComparableExample>();
		
		/* Data 1 */
		ComparableExample ce1 = new ComparableExample();
		ce1.setId(33l);
		ce.add(ce1);
		
		/* Data 2 */
		ComparableExample ce2 = new ComparableExample();
		ce2.setId(32l);
		ce.add(ce2);
		
		/* Data 3 */
		ComparableExample ce3 = new ComparableExample();
		ce3.setId(45l);
		ce.add(ce3);
		
		/* Collection */
		Collections.sort(ce);
		
		/* Compare result */
		for(ComparableExample result : ce)
			System.out.println(result.getId());

	}

}
